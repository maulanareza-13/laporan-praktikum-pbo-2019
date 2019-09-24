/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reza.relasi.percobaan1;

/**
 *
 * @author user
 */
public class Percobaan11841720046Reza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Processor1841720046Reza p = new Processor1841720046Reza("Intel i5",3);
        Laptop1841720046Reza L = new Laptop1841720046Reza("Thinkpad" , p);
        
        L.infoReza();
        
        Processor1841720046Reza p1 = new Processor1841720046Reza();
        p1.setMerk("Intel i5");
        p1.setCache(4);
        Laptop1841720046Reza L1 = new Laptop1841720046Reza();
        L1.setMerk("Thinkpad");
        L1.setProc(p1);
        L1.infoReza(); 
    }
    
}
