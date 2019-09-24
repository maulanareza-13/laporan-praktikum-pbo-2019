/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reza.relasiclass.percobaan3;

/**
 *
 * @author user
 */
public class MainPercobaan31841720046Reza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      pegawai1841720046Reza masinis = new pegawai1841720046Reza("1234","Spongbob Squarepants");
      pegawai1841720046Reza asisten = new pegawai1841720046Reza("4567","Patrick Star");
      
      KeretaApi1841720046Reza keretaApi = new KeretaApi1841720046Reza("Gaya Baru","Bisnis",masinis,asisten);
      System.out.println(keretaApi.info());
      
      
      
    }
    
}
