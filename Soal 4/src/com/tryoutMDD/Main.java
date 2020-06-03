package com.tryoutMDD;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str;
        Scanner kata = new Scanner(System.in);
        System.out.print("Masukkan kata atau kalimat yang ingin anda cek : ");
        str = kata.nextLine();
        StringBuffer newStr =new StringBuffer();
        for(int i = str.length()-1; i >= 0 ; i--) {
            newStr = newStr.append(str.charAt(i));
        }
        if(str.equalsIgnoreCase(newStr.toString())) {
            System.out.println("Kata atau kalimat ini adalah palindrome");
        } else {
            System.out.println("Kata atau kalimat ini bukan palindrome");
        }
    }
}