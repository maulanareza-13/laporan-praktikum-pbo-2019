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
public class JenisVape {
    private int harga;
    private String jenisVape;
    
    public void setJenis(String jenisVape){
        this.jenisVape = jenisVape;
    }
    public String getJenisVape(){
        return jenisVape;
    }
    
    public void setHarga(int harga){
        this.harga = harga;
    }
    public int getBayar(){
        return harga;
    }
    
    public int hitungBayarBeliVape(int Beli){
        return harga *Beli ;
    }
    public int Vapenord(int harga){
        return harga;
    }
    public int VapeVgod(int harga){
        return harga;
    }
    public int VapeHotcig(int harga){
        return harga;
    }
    public int VapeHexohm(int harga){
        return harga;
    }
    public void tampil(){
        System.out.println("Jenis jenis harga Vape: ");
        System.out.println("Harga VapeNord : "+Vapenord(20000));
        System.out.println("Harga VapeVgod : "+VapeVgod(80000));
        System.out.println("Harga VapeHotcig : "+VapeHotcig(49000));
        System.out.println("Harga VapeHexohm: "+VapeHexohm(300000));
    }
}


