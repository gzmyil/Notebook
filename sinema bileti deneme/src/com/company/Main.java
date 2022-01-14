package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int seyirciler;
        String[] kisiler;
        String kisiismi;
        String secim;
        boolean control = false;
        String[] kisiadi;
        int kisiyasi = 0;
        int gencbilet = 10;
        int toplam = 0;
        int normalbilet = 20;
        int[] yas;

        Scanner klavye = new Scanner(System.in);

        do {
            System.out.print("Seyirci sayısını giriniz :");
            seyirciler = klavye.nextInt();

            if (seyirciler > 10) {
                System.out.println("Yeterli koltuk bulunmamaktadır.");
                control = true;
            } else if (seyirciler < 0) {
                System.out.println("Hatalı giriş yaptınız.");
                control = true;
            } else if (seyirciler == 0) {
                System.out.println("çıkış yapılıyor.");
                control = true;
            } else
                System.out.println("Kişi sayısı oluşturuldu lütfen kişi adlarını giriniz");

            kisiler = new String[seyirciler];
            yas = new int[seyirciler];

            Scanner klavye1 = new Scanner(System.in);
            Scanner klavye2 = new Scanner(System.in);

            for (int i = 0; i < seyirciler; i++) {
                System.out.print((i + 1) + ".ıncı kişi adını giriniz :");
                kisiismi = klavye1.nextLine();
                kisiler[i] = kisiismi;

                System.out.print("Yaşlarını da giriniz :");
                kisiyasi = klavye2.nextInt();
                yas[i] = kisiyasi;
            }


            for (int j = 0; j < seyirciler; j++) {
                if (yas[j] < 18) {
                    toplam = toplam + gencbilet;
                } else
                    toplam = toplam + normalbilet;
            }
            do {
                System.out.println("Toplam bilet fiyatınız=" + toplam + "\ndevam etmek için Y, çıkmak için N yi tuşlayınız.");

                Scanner klavye4 = new Scanner(System.in);
                secim = klavye4.nextLine();
                switch (secim) {
                    case "Y":
                        System.out.println("Oturma düzeni");
                        for (int i = 0; i < 10; i++) {
                            if (i < seyirciler) {
                                System.out.println(i + 1 + ". sırada, " + kisiler[i] + " oturuyor.");
                            } else {
                                System.out.println((i + 1) + ". sıra boş");
                            }
                        }
                        control = true;

                    case "N":
                        System.out.println("İşleminiz sonlandırıldı.");
                        control = true;
                        break;

                    default:
                        System.out.println("Yanlış bir işlem girdiniz, tekrar deneyiniz");
                }


            } while (!control) ;
        }while (seyirciler != 0);
    }
}