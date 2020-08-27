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
public class Reverse {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Masukan kata : ");
        System.out.println("Hasil membalikan kata : "+ reverse(sc.nextLine()));
    }

    private static String reverse(String word) {
        if (word.length()==1) {
            return word;
        }else{
         char c = word.charAt(0);
         return reverse(word.substring(1))+c; 
        }
       
    }
}
