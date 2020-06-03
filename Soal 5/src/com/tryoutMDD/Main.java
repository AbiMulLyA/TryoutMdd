package com.tryoutMDD;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int tahun1;
        int tahun2;
        int n, temp = 0;
        Scanner tahun = new Scanner(System.in);
        System.out.print("Masukkan Tahun 1 : ");
        tahun1 = tahun.nextInt();
        System.out.print("Masukkan Tahun 2 : ");
        tahun2 = tahun.nextInt();
        n = 0;
        if (tahun1 > tahun2) {
            n = tahun1 - tahun2;
        } else if (tahun1 < tahun2) {
            n = tahun2 - tahun1;
        }
        int[] listTahun = new int[n];
        System.out.println("========================================================");
        System.out.println("Tahun Kabisat antara tahun " + tahun1 + " dan tahun " + tahun2 + " adalah :" );
        if(tahun1 > tahun2){
            for (int i = 0; i < n - 1; i++) {
                listTahun[i] = tahun1 - 1;
                if((listTahun[i] % 400) == 0 || (listTahun[i] % 100) == 0 || (listTahun[i] % 4) == 0){
                    temp = listTahun[i];
                    listTahun[i] = temp;
                    System.out.print(listTahun[i] + ", ");
                }
                tahun1--;
            }
        }else if(tahun1 < tahun2){
            for (int i = 0; i < n - 1; i++) {
                listTahun[i] = tahun1 + 1;
                if((listTahun[i] % 400) == 0 || (listTahun[i] % 100) == 0 || (listTahun[i] % 4) == 0){
                    temp = listTahun[i];
                    listTahun[i] = temp;
                    System.out.print(listTahun[i] + ", ");
                }
                tahun1++;
            }
        }
    }
}
