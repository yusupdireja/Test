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
public class Cipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kata;
        int size;
        
        //inputan
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan kata, dan angka sebagai parameter ubah kata");
        System.out.print("Kata :");
        kata = sc.nextLine();
        System.out.print("Angka :");
        size = sc.nextInt();
        
        //output
        System.out.println("");
        System.out.println("Hasil data masukan");
        System.out.println(cipher(kata, size));
   
    }

    private static String cipher(String kata, int length) {
        length = length % 26 + 26;
        StringBuilder word = new StringBuilder();
        for (char i : kata.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    word.append((char) ('A' + (i - 'A' + length) % 26 ));
                } else {
                    word.append((char) ('a' + (i - 'a' + length) % 26 ));
                }
            } else {
                word.append(i);
            }
        }
        return word.toString();
    }
}
