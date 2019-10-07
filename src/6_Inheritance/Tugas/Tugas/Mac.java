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
public class Mac extends Laptop {
    public String security;
    
    public Mac(){
        
    }

    public Mac(String security, String jnsBaterai, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(jnsBaterai, merk, jnsProsesor, kecProsesor, sizeMemory);
        this.security = security;
    }
    
    public void tampilMac(){
        super.tampilData();
        System.out.println("Security            ="+security);
    }
}




