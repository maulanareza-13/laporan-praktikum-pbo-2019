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
public class Tester2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      PermanentEmployee1841720046Reza pEmp = new PermanentEmployee1841720046Reza("Dedik", 500);
        
        Employee1841720046Reza e;
        
        e = pEmp;
        
        System.out.println("" + e.getEmployeeInfo());
        System.out.println("=====================");
        System.out.println(""+ pEmp.getEmployeeInfo());
    }
}
