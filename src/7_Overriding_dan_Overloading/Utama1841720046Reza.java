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
public class Utama1841720046Reza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager & Staff");
        Manager1841720046Reza man[]=new Manager1841720046Reza[2];
        Staff1841720046Reza staff1[]=new Staff1841720046Reza[2];
        Staff1841720046Reza staff2[]=new Staff1841720046Reza[3];
        
        //pembuatan manager
        
        man[0]=new Manager1841720046Reza();
        man[0].setNamaReza("Tedjo");
        man[0].setNipReza("101");
        man[0].setGolonganReza("1");
        man[0].setTunjangan(5000000);
        man[0].setBagian("Administrasi");
        
        man[1]=new Manager1841720046Reza();
        man[1].setNamaReza("Atika");
        man[1].setNipReza("102");
        man[1].setGolonganReza("1");
        man[1].setTunjangan(2500000);
        man[1].setBagian("Pemasaran");
        
        
        staff1[0]=new Staff1841720046Reza();
         staff1[0].setNamaReza("Usman");
         staff1[0].setNipReza("0003");
         staff1[0].setGolonganReza("2");
         staff1[0].setLembur(10);
         staff1[0].setGajiLembur(10000);
         
         staff1[1]=new Staff1841720046Reza();
         staff1[1].setNamaReza("Anugrah");
         staff1[1].setNipReza("0005");
         staff1[1].setGolonganReza("2");
         staff1[1].setLembur(10);
         staff1[1].setGajiLembur(55000);
         man[0].setStaff(staff1);
         
         
         staff2[0]=new Staff1841720046Reza();
         staff2[0].setNamaReza("Hendra");
         staff2[0].setNipReza("0004");
         staff2[0].setGolonganReza("3");
         staff2[0].setLembur(15);
         staff2[0].setGajiLembur(5500);
         
         staff2[1]=new Staff1841720046Reza();
         staff2[1].setNamaReza("Arie");
         staff2[1].setNipReza("0006");
         staff2[1].setGolonganReza("4");
         staff2[1].setLembur(5);
         staff2[1].setGajiLembur(100000);
         
         staff2[2]=new Staff1841720046Reza();
         staff2[2].setNamaReza("Mentari");
         staff2[2].setNipReza("0007");
         staff2[2].setGolonganReza("3");
         staff2[2].setLembur(6);
         staff2[2].setGajiLembur(20000);
         man[1].setStaff(staff2);
         
         //cetak informasi dari manager + staffnya
         man[0].lihatInfo();
         man[1].lihatInfo();
         
    }
    
}
