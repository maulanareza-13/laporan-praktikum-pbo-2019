/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu10;

/**
 *
 * @author user
 */
public class Owner1841720046Reza {
    public void pay(Payable1841720046Reza p){
        System.out.println("Total payment = "+ p.getPaymentAmount());
        if (p instanceof ElectricityBill1841720046Reza) {
            ElectricityBill1841720046Reza eb = (ElectricityBill1841720046Reza)p;
            System.out.println(""+eb.getBillInfo());
        } else if (p instanceof PermanentEmployee1841720046Reza) {
            PermanentEmployee1841720046Reza pe = (PermanentEmployee1841720046Reza)p;
            pe.getEmployeeInfo();
            System.out.println(""+pe.getEmployeeInfo());
        }
    }
    public void showMyEmployee(Employee1841720046Reza e) {
        System.out.println(""+e.getEmployeeInfo());
        if (e instanceof PermanentEmployee1841720046Reza) {
            System.out.println("You have to pay her/him monthly!!!");
        } else {
            System.out.println("No need to pay him/her :)");
        }
    }
}


