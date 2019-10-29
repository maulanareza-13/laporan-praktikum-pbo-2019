/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9.abstractclass;

/**
 *
 * @author user
 */
public abstract class Hewan1841720046Reza {
    private int umur;
    
    protected Hewan1841720046Reza(){
        this.umur = 0;
    }
    public void bertambahUmur(){
        this.umur +=1;
    }
    public abstract void bergerak();
}
