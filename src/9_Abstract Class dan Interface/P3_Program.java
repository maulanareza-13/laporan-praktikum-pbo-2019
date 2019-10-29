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
public class Program {

    /**
     * @param args
     */
    public static void main(String[] args){
        Rektor1841720046Reza pakRektor = new Rektor1841720046Reza();
        
        //P3_Mahasiswa1841720146Bagus MahasiswaBiasa = new P3_Mahasiswa1841720146Bagus("Charlie");
        Sarjana1841720046Reza sarjanaCumlaude = new Sarjana1841720046Reza("Dini");
        PascaSarjana1841720046Reza masterCumlaude = new PascaSarjana1841720046Reza("Elok");
        
        //MahasiswaBiasa.kuliahDikampusBagus();
        //pakRektor.beriSertifikatCumlaude(masterCumlaude);
        //sarjanaCumlaude.kuliahDikampusBagus();
        //pakRektor.beriSertifikatCumlaude(MahasiswaBiasa);
        //masterCumlaude.kuliahDikampusBagus();
        //pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        
        pakRektor.beriSertifikatMawapres(masterCumlaude);
        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
    }

}