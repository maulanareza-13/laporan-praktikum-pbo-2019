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
public class BekerVape1841720046Reza {
private String merek;
private int watt;
private int harga;
private String tipe;


    public void setmerek(String m){
        merek = m;
    }
    
    public void gantiwatt(int w){
        watt = w;
    }
    public void tambahwatt(int tw){
        watt = watt - tw;
    }
    public void harga(int h){
        harga = h;
    }
    public void settipe(String P){
        tipe = P;
    }
    
    public void cetakStatusBekerVapeReza(){
        System.out.println("merek:" + merek);
        System.out.println("watt:" + watt);
        System.out.println("harga:" + harga );
        System.out.println("tipe:" + tipe);
        
        
    }
}
