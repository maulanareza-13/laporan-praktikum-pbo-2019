/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9.abstractclass.percobaan3;

/**
 *
 * @author user
 */
public class Mahasiswa1841720046Reza implements Icumlaude1841720046Reza {
  
    protected String nama;

    public Mahasiswa1841720046Reza(String nama) {
        this.nama = nama;
    }
      
    public void kuliahDikampusBagus(){
        System.out.println("Aku mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }

    @Override
    public void lulus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void meraihIPKTinggi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void kuliahDikampus(){
        System.out.println("Aku mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }
}


