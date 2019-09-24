/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reza.relasiclass.percobaan3;

/**
 *
 * @author user
 */
public class KeretaApi1841720046Reza {
    private String nama;
    private String kelas;
    private pegawai1841720046Reza masinis;
    private pegawai1841720046Reza asisten;

    public KeretaApi1841720046Reza() {
    }

    public KeretaApi1841720046Reza(String nama, String kelas, pegawai1841720046Reza masinis, pegawai1841720046Reza asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }
    

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public pegawai1841720046Reza getMasinis() {
        return masinis;
    }

    public pegawai1841720046Reza getAsisten() {
        return asisten;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setMasinis(pegawai1841720046Reza masinis) {
        this.masinis = masinis;
    }

    public void setAsisten(pegawai1841720046Reza asisten) {
        this.asisten = asisten;
    }
    public String info (){
     String info = "";
     info += "Nama:"+this.nama + "\n";
     info += "Kelas:"+this.kelas + "\n";
     info += "Masinis:"+this.masinis.info() + "\n";
     info += "   Asisten:"+this.asisten.info() + "\n";
     return info;
    }
    
}
