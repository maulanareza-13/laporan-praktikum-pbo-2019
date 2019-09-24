/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reza.relasiclass.percobaan4;

/**
 *
 * @author user
 */

public class Kursi1841720046Reza {
    private String nomor;
    private Penumpang1841720046Reza penumpang;
    
      public Kursi1841720046Reza(String nomor) {
        this.nomor = nomor;
        
    }

    public void setNomorReza(String nomor) {
        this.nomor = nomor;
    }

    public void setPenumpangReza(Penumpang1841720046Reza penumpang) {
        this.penumpang = penumpang;
    }

    public String getNomorReza() {
        return nomor;
    }

    public Penumpang1841720046Reza getPenumpangReza() {
        return penumpang;
    }
    
        
    public String infoReza(){
        String info ="";
        info+="Nomor: "+ nomor + "\n";
        if (this.penumpang != null){
        info+="Penumpang:"+penumpang.info()+"\n";
        }
    return info;
    }
}


