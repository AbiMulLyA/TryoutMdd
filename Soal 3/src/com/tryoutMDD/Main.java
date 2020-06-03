package com.tryoutMDD;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int max = 0;
        int min = 1000;
        float rata, total=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan berapa jumlah nilai yang anda akan input? :");
        n = s.nextInt();
        int [] nilai = new int[n];
        System.out.println("Masukkan nilai - nilainya :");
        for(int i = 0; i < n; i++){
            nilai[i] = s.nextInt();
            total = total + nilai[i];
        }
        System.out.println("Deretan angka yang anda input :");
        for( int b : nilai ){
            System.out.print(b + ", ");
        }
        System.out.println("\n");
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            } else if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        System.out.println("Nilai Maksimum : " + max);
        System.out.println("Nilai Minimun  : " + min);
        rata = total/n;
        System.out.println("Hasil nilai total adalah : " + total);
        System.out.println("Hasil rata-rata adalah : " + rata);

    }
}

