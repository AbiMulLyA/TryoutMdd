package com.tryoutMDD;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            String str;
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan kalimat yang ingin dibalik : ");
            str = input.nextLine();
            System.out.println("Sebelum di balik : "+str);
            System.out.println("Setelah di balik : "+new StringBuffer(str).reverse());
        }
}
