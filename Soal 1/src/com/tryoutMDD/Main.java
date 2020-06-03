package com.tryoutMDD;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nilai;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        nilai = input.nextInt();

        if(nilai >= 90){
            System.out.println('A');
        }else if(nilai >= 80 && nilai <= 89){
            System.out.println('B');
        }else if(nilai >= 70 && nilai <= 79){
            System.out.println('C');
        }else if(nilai >= 60 && nilai <= 69){
            System.out.println('D');
        }else if(nilai <= 59){
            System.out.println('e');
        }
    }
}
