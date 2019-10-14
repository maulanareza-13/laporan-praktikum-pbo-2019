/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;

/**
 *
 * @author user
 */
public class Segitiga {
    public int sudut;
    
    public int totalSudutReza(int sudutA){
        int sudut = 180 - sudutA;
        return sudut;
    }
    public int totalSudutReza(int sisiA, int sisiB, int sisiC){
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }
    public double kelilingReza(int sisiA,int sisiB){
        double keliling = Math.sqrt(Math.pow(sisiA, 2)+Math.pow(sisiB,2));
        return keliling;
    }
}
