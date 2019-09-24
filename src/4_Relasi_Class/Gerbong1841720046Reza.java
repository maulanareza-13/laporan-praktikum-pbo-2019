/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reza.relasiclass.percobaan4;

/**
 *
 * @author user
 */
public class Gerbong1841720046Reza {
    private String kode;
    private Kursi1841720046Reza[] arrayKursi;

    public Gerbong1841720046Reza(String kode, Kursi1841720046Reza[] arrayKursi) {
        this.kode = kode;
        this.arrayKursi = arrayKursi;
    }
    
    
    private void initKursiReza(){
        for(int i = 0; i < arrayKursi.length; i++){
            this.arrayKursi[i] = new Kursi1841720046Reza(String.valueOf(i + 1));
        }
    }
    
    public Gerbong1841720046Reza(String kode, int jumlah){
        this.kode = kode;
        this.arrayKursi = new Kursi1841720046Reza[jumlah];
        this.initKursiReza();
    }
    
    public String infoReza(){
        String info = "";    
        info += "Kode: " + kode + "\n";
        for(Kursi1841720046Reza kursi : arrayKursi){
            info += kursi.infoReza();
        }    
        return info;
    }
    
    public void setPenumpangReza(Penumpang1841720046Reza penumpang, int nomor){
        this.arrayKursi[nomor - 1].setPenumpangReza(penumpang);
    }
}
   
       
   