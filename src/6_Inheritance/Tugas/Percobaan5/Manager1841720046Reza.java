/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan5jb6;

/**
 *
 * @author user
 */
public class Manager1841720046Reza extends Karyawan1841720046Reza {
    public int tunjangan;
    
    public Manager1841720046Reza(){
        
    }
    public void tampilDataManager(){
        super.tampilDataKaryawan();
        System.out.println("Tunjangan       ="+tunjangan);
        System.out.println("Total Gaji       ="+super.gaji+tunjangan);
        
    }
}
