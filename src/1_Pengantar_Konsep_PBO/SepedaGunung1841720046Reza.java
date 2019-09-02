/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo;

/**
 *
 * @author user
 */
public class SepedaGunung1841720046Reza extends Sepeda1841720046Reza {
    private String tipeSuspensi;
    
    public void SetTipeSuspensi(String newValue){
        tipeSuspensi = newValue;
    }
    public void cetakStatus(){
        super.cetakStatusReza();
        System.out.println("tipe suspensi:" + tipeSuspensi);
    }
}
