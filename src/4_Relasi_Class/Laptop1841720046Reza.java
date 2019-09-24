package reza.relasi.percobaan1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Laptop1841720046Reza {
    
    private String merk;
    private Processor1841720046Reza proc;

    public Laptop1841720046Reza() {
    }

    public Laptop1841720046Reza(String merk, Processor1841720046Reza proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setProc(Processor1841720046Reza proc) {
        this.proc = proc;
    }
    
    public void infoReza(){
        System.out.println("Merk Laptop = " + merk);
        proc.infoReza();
    }
}


