/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reza.relasi.percobaan1;

/**
 *
 * @author user
 */
public class Processor1841720046Reza {
    private String merk;
    private double cache;

    public Processor1841720046Reza(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    Processor1841720046Reza() {
       
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }
    
    public void infoReza(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("cache Memory = %.2f\n", cache );
        
    }
    
    
    

        
}
