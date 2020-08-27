/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Scanner;


/**
 *
 * @author Yusup
 */
public class Palindrome {
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); 
         String word ="";
         String exit;
         do {            
            System.out.print("Masukan Karakter :");
            word= word + sc.next();
            System.out.print("Masukan karakter lagi(y/t) :");
            exit= sc.next();
        } while (exit.equals("y"));
        System.out.println("");
        System.out.println("Hasil Palindrome Struktur:");
        palindrome(word);
    }

    private static void palindrome(String word) {
      for (int i = word.length()-1; i>=0; i--) {
            if (i==word.length()-1) {
                continue;
            }
            word = word+word.charAt(i);
        }
        System.out.println(word);
    }
    
   
   
}
