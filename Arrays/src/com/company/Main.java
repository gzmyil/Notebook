package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] seyirciler;
        int[] kisiYaslari;
        int kisiSayisi = 0, toplamBiletFiyat = 0, gencBilet = 10, normalBilet = 20;
        String[] kisiİsimleri;
        boolean control = false;
        String kisiAdi = "", secim = "";

        Scanner klavye = new Scanner(System.in);

        do {
            System.out.println("Grupta bulunan kişi sayısını giriniz : (0 - Exit)");
            control = false;

            kisiSayisi = klavye.nextInt();

            if (kisiSayisi > 10) {
                System.out.println("Yeterli yer bulunmamaktadır.");
                control = true;
            } else if (kisiSayisi < 0) {
                System.out.println("Bu şekilde giriş yapamazsınız. Kişi sayısı belirtin.");
                control = true;
            } else if (kisiSayisi == 0) {
                System.out.println("Çıkış yapılıyor...");
                control = true;
            } else {
                seyirciler = new int[kisiSayisi];
                kisiİsimleri = new String[kisiSayisi];
                kisiYaslari = new int[kisiSayisi];

                System.out.println("Kişi Listesi Oluşturuldu, Lütfen İsimlerini Giriniz");
                Scanner klavye2 = new Scanner(System.in);
                Scanner klavye3 = new Scanner(System.in);

                for (int i = 0; i < kisiSayisi; i++) {
                    seyirciler[i] = i + 1;
                    System.out.println((i + 1) + " inci kişinin adını giriniz : ");
                    kisiAdi = klavye2.nextLine();
                    kisiİsimleri[i] = kisiAdi;
                    System.out.println("Yaşını da giriniz : ");
                    kisiYaslari[i] = klavye3.nextInt();


                    for (int j = 0; j < kisiSayisi; j++) {
                        if (kisiYaslari[j] > 18) {
                            toplamBiletFiyat = toplamBiletFiyat + normalBilet;
                        } else {
                            toplamBiletFiyat = toplamBiletFiyat + gencBilet;
                        }
                    }
                }

                do {
                    System.out.println("Toplam fiyatınız = " + toplamBiletFiyat + " kadardır. \nDevam etmek için Y, Çıkmak için N basınız.");
                    secim = klavye2.nextLine();

                    switch (secim) {
                        case "Y":
                            System.out.println("Oturma düzeni : ");
                            for (int i = 0; i < 10; i++) {
                                if (i < kisiSayisi) {
                                    System.out.println(seyirciler[i] + " inci sırada " + kisiİsimleri[i] + " oturuyor.");
                                } else {
                                    System.out.println((i + 1) + " inci sıra boş");
                                }
                            }
                            control = true;
                            break;
                        case "N":
                            System.out.println("İşleminiz sonlandırıldı.");
                            control = true;
                            break;
                        default:
                            System.out.println("Yanlış bir işlem girdiniz, tekrar deneyin.");
                    }
                } while (!control);
            }
            }while (kisiSayisi != 0);





        /*int[] sayilar = new int[10];
        Scanner klavye = new Scanner(System.in);

        //sayıları diziye atama
        for (int i=0; i<10; i++){
            System.out.print((i+1)+". sayıyı giriniz: ");
            sayilar[i] = klavye.nextInt();
        }
        System.out.println(sayilar);
        }*/


    }
}
