/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjb6;

/**
 *
 * @author user
 */
public class Komputer {
    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;
    
    Komputer(){
        
    }

    public Komputer(String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        this.merk = merk;
        this.jnsProsesor = jnsProsesor;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
    }
    
    public void tampilData(){
        System.out.println("Jenis Prosesor      ="+jnsProsesor);
        System.out.println("Kecepatan Prosesor  ="+kecProsesor);
        System.out.println("Merek Prosesor      ="+merk);
        System.out.println("Size Prosesor       ="+sizeMemory);
    }
}


