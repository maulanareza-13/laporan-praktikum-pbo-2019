/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan5jb6;

/**
 *
 * @author user
 */
public class Karyawan1841720046Reza {
    public String nama, alamat, jk;
    public int umur, gaji;
    
    public Karyawan1841720046Reza(){
    }
    public Karyawan1841720046Reza(String nama, String alamat, String jk, int umur,int gaji){
        this.nama=nama;
        this.alamat=alamat;
        this.jk=jk;
        this.umur=umur;
        this.gaji=gaji;
        
    }
    public void tampilDataKaryawan(){
        System.out.println("Nama            ="+nama);
        System.out.println("Alamat          ="+alamat);
        System.out.println("Jenis Kelamin   ="+jk);
        System.out.println("Umur            ="+umur);
        System.out.println("Gaji            ="+gaji);
        
    }
        
    }
        
    
