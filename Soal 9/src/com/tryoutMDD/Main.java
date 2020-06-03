package com.tryoutMDD;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Jakarta");
        list.add("Aceh");
        list.add("Malang");
        list.add("Medan");
        list.add("Bontang");
        list.add("Jogja");
        list.add("Jakarta");
        list.add("Bandung");
        list.add("Malang");
        list.add("Solo");
        list.add("Palembang");
        list.add("Bandung");

        System.out.println("List Sebelum data ganda dihapus");
        System.out.println("================================");
        for(Object str : list){
            System.out.print(str + ", ");
        }
        System.out.println("\n");
        System.out.println("List Setelah data ganda dihapus");
        System.out.println("================================");
        List list2 = new ArrayList(new HashSet(list));
        for(Object str : list2){
            System.out.print(str + ", ");
        }
    }
}
