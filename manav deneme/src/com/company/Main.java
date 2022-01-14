package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int sebzeler = 0;
        float salatalikUcreti = 0, domatesUcreti = 0, brokoliUcreti = 0, muzUcreti = 0;
        float toplam = 0;


        System.out.println("1.Salatalık kilosu: 5tl");
        System.out.println("2.Domates kilosu: 10tl");
        System.out.println("3.Brokoli kilosu: 15tl");
        System.out.println("4.Muz kilosu: 20tl");
        System.out.println("Çıkış için 0 tuşuna basınız...");

        do {
                System.out.print("Lütfen sebze türünü seçiniz :");
                sebzeler = klavye.nextInt();
                if(sebzeler == 0){
                    break;
                }else if (sebzeler > 4) {
                    System.out.println("Yanlış giriş yaptınız.");
                } else {
                    System.out.print("Lütfen kilo giriniz:");
                }
                Scanner klavye2 = new Scanner(System.in);
                float kilo = klavye2.nextFloat();

                if (sebzeler == 1) {
                    salatalikUcreti = kilo * 5;
                    System.out.println("Salatalık ücreti:" + salatalikUcreti);
                    toplam = toplam + salatalikUcreti;
                } else if (sebzeler == 2) {
                    domatesUcreti = kilo * 10;
                    System.out.println("Domates ücreti:" + domatesUcreti);
                    toplam = toplam + domatesUcreti;
                } else if (sebzeler == 3) {
                    brokoliUcreti = kilo * 15;
                    System.out.println("Brokoli ücreti:" + brokoliUcreti);
                    toplam = toplam + brokoliUcreti;
                } else if (sebzeler == 4) {
                    muzUcreti = kilo * 15;
                    System.out.println("Muz ücreti:" + muzUcreti);
                    toplam = toplam + muzUcreti;
                }
        }while (true) ;
        System.out.println("------------------------------");
        System.out.println("Alışveriş toplamı : " + toplam);
        System.out.println("------------------------------");
    }
}
