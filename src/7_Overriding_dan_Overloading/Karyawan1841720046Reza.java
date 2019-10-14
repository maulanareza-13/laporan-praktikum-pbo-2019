/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;

/**
 *
 * @author user
 */
public class Karyawan1841720046Reza {
private String nama;
private String nip;
private String golongan;
private double gaji;

public void setNamaReza(String nama){
    this.nama=nama;
}
public void setNipReza(String nip){
    this.nip=nip;
}
public void setGolonganReza(String golongan){
    this.golongan=golongan;
    
    switch(golongan.charAt(0)){
        case '1':this.gaji=5000000;
        break;
        case '2':this.gaji=3000000;
        break;
        case '3':this.gaji=2000000;
        break;
        case '4':this.gaji=1000000;
        break;
        case '5':this.gaji=750000;
        break;
    }
}
public void setGaji(double gaji){
    this.gaji=gaji;
}
public String getNama(){
    return nama;
}
public String getNip(){
    return nip;
}
public String getGolongan(){
    return golongan;
}
public double getGaji(){
    return gaji;
    }
}
