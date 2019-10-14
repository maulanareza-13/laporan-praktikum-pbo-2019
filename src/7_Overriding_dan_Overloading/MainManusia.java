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
public class MainManusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Manusia m = new Manusia();
       Dosen d = new Dosen();
       Mahasiswa mh = new Mahasiswa();
       
        
        System.out.println("|===================================|");
        System.out.println("|              MANUSIA              |");
        System.out.println("|===================================|");
        m.BernafasReza();
        m.MakanReza();
        System.out.println("|===================================|");
        System.out.println("|               DOSEN               |");
        System.out.println("|===================================|");
        d.MakanReza();
        d.LemburReza();
        System.out.println("|===================================|");
        System.out.println("|             MAHASISWA             |");
        System.out.println("|===================================|");
        
       mh.MakanReza();
       mh.TidurReza();
    
}
}
