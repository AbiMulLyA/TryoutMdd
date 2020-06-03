package com.tryoutMDD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int jumlah = 0;
        int nilai = 0;
        List<Integer> listInt = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        int counter = 1;
        String userInput;

        while (true) {
            System.out.print("Masukkan angka "+ counter +" : ");
            userInput = s.nextLine();
            if (userInput.equals("=")) {
                break;
            }
            nilai = Integer.valueOf(userInput);
            listInt.add(nilai);
            counter++;
        }
        for(int i = 0; i< counter-1; i++){
            jumlah = jumlah + listInt.get(i);
        }
        System.out.println("===================================");
        System.out.println("Jumlah dari angka yang diinput : " + jumlah);
    }
}