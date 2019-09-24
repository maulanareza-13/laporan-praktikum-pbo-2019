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
public class pegawai1841720046Reza {
    private String nip;
    private String nama;

    public pegawai1841720046Reza() {
    }

    public pegawai1841720046Reza(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }
    
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String info() {String info = "";
    info += "Nip:" + this.nip + "\n";
    info += "Nama:" + this.nama + "\n";
    return info;
    
    }
    
}
