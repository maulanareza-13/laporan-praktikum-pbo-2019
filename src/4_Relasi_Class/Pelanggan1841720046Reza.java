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
public class Pelanggan1841720046Reza{
  private String nama;
  private Mobil1841720046Reza mobil;
  private Sopir1841720046Reza sopir;
  private int hari;

    public Pelanggan1841720046Reza() {
    }

    public String getNama() {
        return nama;
    }

    public Mobil1841720046Reza getMobil() {
        return mobil;
    }

    public Sopir1841720046Reza getSopir() {
        return sopir;
    }

    public int getHari() {
        return hari;
    }

    public void setNamaReza(String nama) {
        this.nama = nama;
    }

    public void setMobilReza(Mobil1841720046Reza mobil) {
        this.mobil = mobil;
    }

    public void setSopirReza(Sopir1841720046Reza sopir) {
        this.sopir = sopir;
    }

    public void setHariReza(int hari) {
        this.hari = hari;
    }
  
  public int hitungBiayaTotal(){
      return mobil.hitungBiayaMobil(hari)+
      sopir.hitungBiayaSopir1841720046Reza(hari);
  }
  
}
