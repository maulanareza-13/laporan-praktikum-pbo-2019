/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;

/**
 *
 * @author user
 */
public class Toko1841720046Reza {
    public String id;
    public String nama;
    public String ng;
    public int hs;
    public int ls;
    public int total;
    
    public int peminjamanReza(){
        total = hs*ls;
        return 0;
    }
    public void cetakPeminjamanReza(){
        System.out.println("-------------------------------");
        System.out.println("ID              :"+id);
        System.out.println("Nama            :"+nama);
        System.out.println("Nama Game       :"+ng);
        System.out.println("Harga Sewa      :"+hs);
        System.out.println("lama sewa       :"+ls);
        System.out.println("Total Harga     :"+total);
        
    
    }
}
