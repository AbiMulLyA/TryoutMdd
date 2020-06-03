package com.tryoutMDD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, hasil;
        System.out.print("Masukkan nilai sisi a : ");
        Scanner inputA = new Scanner(System.in);
        a = inputA.nextInt();
        System.out.print("Masukkan nilai sisi b : ");
        Scanner inputB = new Scanner(System.in);
        b = inputB.nextInt();
        hasil = hitung(a, b);
        System.out.println("hasil  : " + hasil);
    }

    public static int hitung(int c, int d) {
        int c1, d1, e;
        c1 = c * 2;
        d1 = d * 2;
        e = tambah(c1, d1);
        return(e);
    }
    public static int tambah(int x, int y){
        int z;
        z = x + y;
        return(z);
    }
}

