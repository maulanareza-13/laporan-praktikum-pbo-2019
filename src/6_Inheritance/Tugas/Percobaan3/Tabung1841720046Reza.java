/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan3jb6;

/**
 *
 * @author user
 */
public class Tabung1841720046Reza extends Bangun1841720046Reza{
    protected int t;
    public void setSuperPhi(double phi){
        super.phi = phi;
    }
    public void setSuperR(int r){
        super.r = r;
    }
    public void setT(int t){
        this.t = t;
    }
    public void volume(){
        System.out.println("Volume Tabung adalah:"+(super.phi*super.r*this.t));
    }
    
}
