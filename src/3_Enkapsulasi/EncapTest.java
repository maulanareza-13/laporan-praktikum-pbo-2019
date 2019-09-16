/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasigettersetter;

/**
 *
 * @author user
 */
public class EncapTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        EncapDemo encap = new EncapDemo();
        encap.setName("fakboy");
        encap.setAge(20);
        
        
        System.out.println("Name: "+ encap.getName());
        System.out.println("Name: "+ encap.getAge());
        
        
    }
    
}
