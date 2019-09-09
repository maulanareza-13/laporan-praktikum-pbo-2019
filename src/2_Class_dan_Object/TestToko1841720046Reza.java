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
public class TestToko1841720046Reza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toko1841720046Reza tk1 = new Toko1841720046Reza();
        Toko1841720046Reza tk2 = new Toko1841720046Reza();
        
        tk1.id = "1841720046";
        tk1.nama = "Maulana Reza Pratama";
        tk1.ng = "pubg";
        tk1.ls = 200000;
        tk1.peminjamanReza();
        tk1.cetakPeminjamanReza();
        tk2.id = "184172001";
        tk2.nama = "Muhammad Afandi";
        tk2.ng = "Forza Horizon 4";
        tk2.ls = 2;
        tk2.peminjamanReza();
        tk2.cetakPeminjamanReza();
    }
    
}
