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
public class Tester3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      PermanentEmployee1841720046Reza pEmp = new PermanentEmployee1841720046Reza("Dedik", 500);
        InternshipEmployee1841720046Reza iEmp = new InternshipEmployee1841720046Reza("Sunarto", 5);
        ElectricityBill1841720046Reza eBill = new ElectricityBill1841720046Reza(5, "R-1");
        
        Employee1841720046Reza e[] = {pEmp, iEmp};
        Payable1841720046Reza p[] = {pEmp, eBill};

        Employee1841720046Reza e2[] = {pEmp, iEmp};
    }
}
