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

public class PascaSarjana1841720046Reza extends Mahasiswa1841720046Reza implements Icumlaude1841720046Reza,IBerprestasi1841720046Reza{

    public PascaSarjana1841720046Reza(String nama) {
        super(nama);
    }

    
    
    

    @Override
    public void menjuaraiKompetisi() {
         System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void membuatPublikasiIlmiah() {
         System.out.println("Saya telah menerbitkan artikel di jurnal INTERNASIONAL"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
