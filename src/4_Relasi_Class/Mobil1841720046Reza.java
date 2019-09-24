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
public class Mobil1841720046Reza {
    private String nama;
    private int biaya;

    public Mobil1841720046Reza() {
    }

    public void setMerkReza(String nama) {
        this.nama = nama;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public String getNama() {
        return nama;
    }

    public int getBiaya() {
        return biaya;
    }
    
    public int hitungBiayaMobil(int hari){
        return biaya * hari;
    }
}
