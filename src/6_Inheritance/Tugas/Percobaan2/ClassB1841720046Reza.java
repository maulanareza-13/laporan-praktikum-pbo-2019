/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan2jb6;

/**
 *
 * @author user
 */
public class ClassB1841720046Reza extends ClassA1841720046Reza{
    private int z;
    
    public void setZReza(int z){
        this.z = z;
    }
    public int getZReza(){
        return z;
    }
    public void getNilaiZReza(){
        System.out.println("nilai Z:" +z);
    }
    public void getJumlahReza(){
        System.out.println("jumlah:"+ getXReza()+getYReza()+z);
        
    }
    
}
