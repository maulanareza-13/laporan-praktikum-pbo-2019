/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bekervape;

/**
 *
 * @author user
 */
public class BekerVapeDemo1841720046 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BekerVape1841720046Reza b1 = new BekerVape1841720046Reza();
        BekerVapePods1841720046Reza b2 = new BekerVapePods1841720046Reza();
       
       b1.setmerek("Upods");
       b1.gantiwatt(2);
       b1.tambahwatt(22);
       b1.harga(200000);
       b1.settipe("mod");
       b1.cetakStatusBekerVapeReza();
       b2.setmerek("hotcig");
       b2.gantiwatt(10);
       b2.tambahwatt(10);
       b2.harga(4000000);
       b2.settipe("pods");
       b2.SetFiturLcdReza("Lcd");
       b2.cetakStatusBekerVapeReza();
     
    }
    
}
