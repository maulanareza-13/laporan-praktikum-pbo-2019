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
public class BekerVapePods1841720046Reza extends BekerVape1841720046Reza {
 private String Lcd;
  public void SetFiturLcdReza(String newValue){
        Lcd = newValue;
  }
 public void cetakStatusBekerVapeReza(){
        super.cetakStatusBekerVapeReza();
        System.out.println("fitur:" +Lcd );
    }
}
  

