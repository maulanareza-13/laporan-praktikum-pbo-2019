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
public class MainPercobaan41841720046Reza {
    public static void main(String[] args) {
        Penumpang1841720046Reza p = new  Penumpang1841720046Reza ("12345", "Mr. Krab");
        Gerbong1841720046Reza gerbong = new Gerbong1841720046Reza ("A", 10);
        gerbong.setPenumpangReza(p, 1);
        System.out.println(gerbong.infoReza());
    }
}
