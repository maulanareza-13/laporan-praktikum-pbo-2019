/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reza.relasiclass.percobaan4.Tugas4;

/**
 *
 * @author user
 */
public class Vape {
    private JenisVape jenis;
    private int bayar;
    
    Vape(){
    }
    
    public void setJenisVape(String jenisPs){
        this.jenis = jenis;
    }
    public JenisVape getJenisVape(){
        return jenis;
    }
    
    public void setBayar(int bayar){
        this.bayar = bayar;
    }
    public int getBayar(){
        return bayar;
    }
    
    public int hitungBayarVape(int jam){
        return bayar * jam;
    }
    
    public void info(){
     System.out.println("Jenis Vape : " + jenis);
     System.out.println("Beli Vape : " + "RP." + bayar);
}
}

