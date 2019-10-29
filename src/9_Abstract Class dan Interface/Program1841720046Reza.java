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
public class Program1841720046Reza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Kucing1841720046Reza kucingKampung = new Kucing1841720046Reza();
       Ikan1841720046Reza lumbaLumba = new Ikan1841720046Reza();
       
       Orang1841720046Reza ani = new Orang1841720046Reza("Ani");
       Orang1841720046Reza budi = new Orang1841720046Reza("budi");
       
       ani.peliharaaanHewan(kucingKampung);
       budi.peliharaaanHewan(lumbaLumba);
       
       ani.ajakPeliharaanJalanJalan();
       budi.ajakPeliharaanJalanJalan();
       
    }
    
}
