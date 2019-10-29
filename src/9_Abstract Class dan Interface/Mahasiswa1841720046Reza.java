/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9.abstractclass.percobaan2;

import pbominggu9.abstractclass.percobaan2.Icumlaude1841720046Reza;

/**
 *
 * @author user
 */
public class Mahasiswa1841720046Reza implements Icumlaude1841720046Reza {
    protected String nama;
    
    public Mahasiswa1841720046Reza(String nama){
        this.nama = nama;
    }

    @Override
    public void lulus() {
       System.out.println("Aku sudah menyelesaikan Skripsi"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51."); //To change body of generated methods, choose Tools | Templates.
    }
    public void kuliahDiKampos(){
        System.out.println("Aku mahasiswa, namaku: "+this.nama);
        
    }
}
