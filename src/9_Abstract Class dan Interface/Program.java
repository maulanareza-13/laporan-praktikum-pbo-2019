/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9.abstractclass.percobaan2;

/**
 *
 * @author user
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rektor1841720046Reza pakRektor = new Rektor1841720046Reza();
       
       Mahasiswa1841720046Reza mahasiswaBiasa = new Mahasiswa1841720046Reza("Carli");
      Sarjana1841720046Reza sarjanaCumlaude = new Sarjana1841720046Reza("Dini");
      PascaSarjana1841720046Reza masterCumlaude = new PascaSarjana1841720046Reza("Elok");
      
      //pakrektor.berisertifikatCumlaude(mahasiswaBiasa);
      //mahasiswaBiasa.kuliahDiKampos();
      //sarjanaCumlaude.kuliahDiKampos();
      pakRektor.beriSertifakCumlaude(sarjanaCumlaude);
      pakRektor.beriSertifakCumlaude(masterCumlaude);
      
    }
    
}
