package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String secim = "", girilen_ifade = "", ad = "", soyad = "", sirket = "";
        int yas = 0;
        boolean control = false;

        Scanner klavye = new Scanner(System.in);

        System.out.println("TCKN mi VKN mi?");

        secim = klavye.nextLine();
        System.out.println(secim);

        if (secim.equals("TCKN") || secim.equals("tckn")) {
            System.out.println("TCKN Giriniz : ");
            girilen_ifade = klavye.nextLine();
            control = true;
        } else {
            System.out.println("VKN Giriniz : ");
            girilen_ifade = klavye.nextLine();
            control = false;
        }

        System.out.println("Girdiniz bilgi : ");
        if (control) {
            System.out.print("TCKN ");
        } else {
            System.out.print("VKN ");
        }
        System.out.println(girilen_ifade);

        System.out.println("Yaşınızı giriniz : ");
        yas = klavye.nextInt();
        if (yas == 18) {
            System.out.println("Yaşınız 18'dır");
        } else if (yas < 18) {
            System.out.println("Yaşınız 18'den ufaktır giriş yapamazsınız.");
        } else {
            Scanner new_klavye = new Scanner(System.in);
            System.out.println("Yaşınız 18'den büyüktür.");
            if (control) {
                System.out.println("Adınızı giriniz : ");
                ad = new_klavye.nextLine();
                System.out.println("Soyadınızı giriniz : ");
                soyad = new_klavye.nextLine();
            } else {
                System.out.println("Şirket adınızı girin.");
                sirket = new_klavye.nextLine();
            }


        }

        if (control)
        {
            System.out.println("Adınız=" + ad + " " + "Soyadınız=" + soyad + " " + "Yaşınız=" + yas + " " + "TCKN=" + girilen_ifade);
        }else{
            System.out.println("Şirket Adı=" + sirket + " " + "Yaşınız=" + yas + " " + "VKN=" + girilen_ifade);


    }
    }
}
