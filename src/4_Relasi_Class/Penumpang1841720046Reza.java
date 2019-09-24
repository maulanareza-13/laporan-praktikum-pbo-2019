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
public class Penumpang1841720046Reza {
   private String ktp;
   private String nama;
   public String info (){
       String info = "";
       info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
   }

    public Penumpang1841720046Reza(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }

   

    public String getKtp() {
        return ktp;
    }

    public String getNama() {
        return nama;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
   
    }

