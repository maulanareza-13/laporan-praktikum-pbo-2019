/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9.abstractclass;

/**
 *
 * @author user
 */
public class Orang1841720046Reza {
private String nama;
private Hewan1841720046Reza hewanPeliharaan;

public Orang1841720046Reza(String nama){
    this.nama = nama;
}
public void peliharaaanHewan(Hewan1841720046Reza hewanPeliharaan){
    this.hewanPeliharaan = hewanPeliharaan;
}
public void ajakPeliharaanJalanJalan(){
    System.out.println("Namaku" +this.nama);
    System.out.println("Hewan Peliharaanku berjalan dengan cara: ");
    this.hewanPeliharaan.bergerak();
    System.out.println("------------------------------------------");
}
}
