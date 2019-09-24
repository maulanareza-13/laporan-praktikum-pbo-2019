/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reza.relasi.percobaan2;

/**
 *
 * @author user
 */
public class MainPercobaan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Mobil1841720046Reza m = new Mobil1841720046Reza();
       m.setMerkReza("Avanza");
       m.setBiaya(350000);
       Sopir1841720046Reza s = new Sopir1841720046Reza();
       s.setNama("john Doe");
       Pelanggan1841720046Reza p = new Pelanggan1841720046Reza();
       p.setNamaReza("Jane Doe");
       p.setMobilReza(m);
       p.setSopirReza(s);
       p.setHariReza(2);
       System.out.println("Biaya Total = " +
        p.hitungBiayaTotal());
       
       
       
       
    }
    
}
