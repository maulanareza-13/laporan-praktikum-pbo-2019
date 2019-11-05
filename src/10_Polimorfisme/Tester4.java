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
public class Tester4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Owner1841720046Reza ow = new Owner1841720046Reza();
        
        ElectricityBill1841720046Reza eBill = new ElectricityBill1841720046Reza(5, "R-1");
        ow.pay(eBill);
        System.out.println("-------------------------");
        
        PermanentEmployee1841720046Reza pEmp = new PermanentEmployee1841720046Reza("Dedik", 500);
        ow.pay(pEmp);
        System.out.println("-------------------------");
        
        InternshipEmployee1841720046Reza iEmp = new InternshipEmployee1841720046Reza("Sunarto", 5);
        ow.showMyEmployee(pEmp);
        System.out.println("-------------------------");
        ow.showMyEmployee(iEmp);
        
    }
}
