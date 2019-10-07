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
public class Windows extends Komputer{
    public String fitur;
    
    public Windows(){
        
    }

    public Windows(String fitur, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.fitur = fitur;
    }
    
    public void tampilWindows(){
        super.tampilData();
        System.out.println("Fitur               ="+fitur);
    }
    
}



