package com.tryoutMDD;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nilai;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        nilai = input.nextInt();
        jenisBilangan(nilai);
    }
    public static void jenisBilangan(int nilai){
        if (nilai % 2 == 0){
            System.out.println("Bilangan ini adalah Genap");
        }else{
            System.out.println("Bilangan ini adalah Ganjil");
        }

    }
}
