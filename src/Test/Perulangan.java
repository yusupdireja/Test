/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author Yusup
 */
public class Perulangan {
     public static void main(String[] args) {
           
         //bagian atas
         for (int i = 1; i < 5; i++) {
             int count = 0;
             //bagian atas kiri
             for (int j = 1; j <= i; j++) {
                System.out.print(j);
                count++;
             }  
             int space = 9 - (count*2);
            //bagian space atas
             for (int j = 0; j <= space; j++) {
                 System.out.print(" ");
             }
            //bagian atas kanan
            for (int j = i; j >= 1; j--) {
                 System.out.print(j);
             }
             
              System.out.println("");
         }
         
         
         
         //bagian bawah
        for (int i = 5; i > 0; i--) {
            int count = 0;
            //bagian bawah kiri
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
                count++;
            }                 
            
            int space = 9 - (count*2);
           //bagian space bawah
            for (int j = 0; j <= space; j++) {
                 System.out.print(" ");
             }
            //bagian bawah kanan
            for (int j = i; j > 0; j--) {
                 System.out.print(j);
            }
              System.out.println(""); 
        }      
    }
}
