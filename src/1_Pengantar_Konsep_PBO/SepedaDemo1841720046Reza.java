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
public class SepedaDemo1841720046Reza {
    public static void main (String[]args){
        //buat dua buah objek sepeda
        Sepeda1841720046Reza spd1 = new Sepeda1841720046Reza();
        Sepeda1841720046Reza spd2 = new Sepeda1841720046Reza();
        SepedaGunung1841720046Reza spd3 = new SepedaGunung1841720046Reza();
        
        //panggil method didalam objek sepeda
        spd1.setMerekReza("polygone");
        spd2.tambahKecepatanReza(10);
        spd1.gantiGearReza(2);
        spd1.cetakStatusReza();
        
        spd2.setMerekReza("Wiim Cycle");
        spd2.tambahKecepatanReza(10);
        spd2.gantiGearReza(2);
        spd2.tambahKecepatanReza(10);
        spd2.gantiGearReza(3);
        spd2.cetakStatusReza();
        
        spd3.setMerekReza("Klinee");
        spd3.tambahKecepatanReza(5);
        spd3.gantiGearReza(7);
        spd3.SetTipeSuspensi("Gas suspension");
        spd3.cetakStatus();
        
    }
}
