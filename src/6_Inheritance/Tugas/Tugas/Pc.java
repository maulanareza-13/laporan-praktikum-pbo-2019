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
public class Pc extends Komputer {
    public int ukuranMonitor;

    public Pc(){
        
    }
    public Pc(int ukuranMonitor, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilPc(){
        super.tampilData();
        System.out.println("ukuran PC           ="+ukuranMonitor);
    }
}




