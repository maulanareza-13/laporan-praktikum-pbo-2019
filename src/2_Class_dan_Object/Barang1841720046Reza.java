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
public class Barang1841720046Reza {
public String namaBrg;
public String jenisBrg;
public int stok;

public void tampilBarang(){
    System.out.println("Nama Barang     :"+namaBrg);
    System.out.println("Jenis Barang    :"+jenisBrg);
    System.out.println("Stok            :"+stok);
}
public int tambahStok(int brgMasuk){
int stokBaru=brgMasuk+stok;
return stokBaru;
    }

}






