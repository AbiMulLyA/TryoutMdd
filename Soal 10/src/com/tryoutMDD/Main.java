package com.tryoutMDD;
import com.google.gson.Gson;

public class Main {
    public static class namaOrang{
        int id;
        String name;
        int age;
        public namaOrang(int id, String name,int age){
            this.id = id;
            this.name= name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        namaOrang orang1 = new namaOrang(1,"Udin", 12);
        namaOrang orang2 = new namaOrang(2,"Reame", 51);
        namaOrang orang3 = new namaOrang(3,"Budi", 34);
        namaOrang orang4 = new namaOrang(4,"Agus", 16);
        namaOrang orang5 = new namaOrang(5,"Sari", 19);
        namaOrang orang6 = new namaOrang(6,"Ririn", 20);
        namaOrang orang7 = new namaOrang(7,"Dessy", 23);
        Gson gson = new Gson();
        String json1 = gson.toJson(orang1);
        System.out.println(json1);
        String json2 = gson.toJson(orang2);
        System.out.println(json2);
        String json3 = gson.toJson(orang3);
        System.out.println(json3);
        String json4 = gson.toJson(orang4);
        System.out.println(json4);
        String json5 = gson.toJson(orang5);
        System.out.println(json5);
        String json6 = gson.toJson(orang6);
        System.out.println(json6);
        String json7 = gson.toJson(orang7);
        System.out.println(json7);
        System.out.println("========================================");
        int umurYangDicari = 21;
        if(orang1.age == umurYangDicari){
            System.out.println("Orang dengan usia " + umurYangDicari + " ditemukan");
        }else if(orang2.age == umurYangDicari){
            System.out.println("Orang dengan usia " + umurYangDicari + " ditemukan");
        }else if(orang3.age == umurYangDicari){
            System.out.println("Orang dengan usia " + umurYangDicari + " ditemukan");
        }else if(orang4.age == umurYangDicari){
            System.out.println("Orang dengan usia " + umurYangDicari + " ditemukan");
        }else if(orang5.age == umurYangDicari){
            System.out.println("Orang dengan usia " + umurYangDicari + " ditemukan");
        }else if(orang6.age == umurYangDicari){
            System.out.println("Orang dengan usia " + umurYangDicari + " ditemukan");
        }else if(orang7.age == umurYangDicari){
            System.out.println("Orang dengan usia " + umurYangDicari + " ditemukan");
        }else{
            System.out.println("Orang dengan usia " + umurYangDicari + " tidak ditemukan");
        }
    }

}