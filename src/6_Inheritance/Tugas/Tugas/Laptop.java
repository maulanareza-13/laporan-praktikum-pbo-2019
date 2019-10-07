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
public class Laptop extends Komputer {
    public String jnsBaterai;
    
    public Laptop(){
        
    }

    public Laptop(String jnsBaterai, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.jnsBaterai = jnsBaterai;
    }
    
    public void tampilLeptop(){
        super.tampilData();
        System.out.println("Jenis Baterai       ="+jnsBaterai);
    }
}
 



