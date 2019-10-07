/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan5jb6;

/**
 *
 * @author user
 */
public class Staff1841720046Reza extends Karyawan1841720046Reza {
    public int lembur,potongan;
    
    public Staff1841720046Reza(){
}
 Staff1841720046Reza(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;

    }

    public void tampilDataStaffReza() {
        super.tampilDataKaryawan();
        System.out.println("Lembur: " + lembur);
        System.out.println("Potongan: " + potongan);
        System.out.println("Total Gaji: " + (gaji + lembur - potongan));

    }

}