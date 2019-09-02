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
public class Sepeda1841720046Reza {
    private String mMerek;
    private int mKecepatan;
    private int mGear;
    
    public void setMerekReza(String newValue){
        mMerek = newValue;
    }
    
        
    public void gantiGearReza(int newValue){
        mGear = newValue;
    }
    public void tambahKecepatanReza(int increment){
        mKecepatan = mKecepatan = increment;
    }
    public void remReza(int decrement){
        mKecepatan = mKecepatan - decrement;
    }
    public void cetakStatusReza(){
        System.out.println("Merek:" + mMerek);
        System.out.println("Kecepatan:" + mKecepatan);
        System.out.println("Gear:" + mGear);
    }
}
