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
public class TestBarang1841720046Reza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barang1841720046Reza brg1=new Barang1841720046Reza();
        brg1.namaBrg="pensil";
        brg1.jenisBrg="ATK";
        brg1.stok=10;
        brg1.tampilBarang();
        // menampilkan dan mengisi argumen untuk menambahkan stok barang
        System.out.println("Stok Baru adalah"+ brg1.tambahStok(20));
        
        

    }
    
}
