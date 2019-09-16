/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Motorencapsulation;

/**
 *
 * @author user
 */
public class Motor1841720046Reza {

       public int kecepatan = 0;
       private boolean kontakOn = false;
       public void nyalakanMesin(){
           kontakOn = true;
       }
       public void MatikanMesin(){
           kontakOn = false;
           kecepatan +=5;
       }
       public void tambahKecepatan(){
           if(kontakOn == true){
               kecepatan +=5;
           }
           else{
               System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off!\n");
           }
       }
       public void kurangiKecepatan(){
           if (kontakOn == true){
               kecepatan-=5;
           }
           else{
               System.out.println("Kecepatan tidak bisa berkurang karena Mesin off!\n");
           }
       }
       public void printStatus(){
           if(kontakOn == true){
               System.out.println("Kontak On");
           }
           else{
               System.out.println("Kontak off");
           }
           System.out.println("Kecepatan" + kecepatan+"\n");
       }
   } 

