package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* String[][]rehber;
        rehber=new String[20][3];
        int secim=0,index=0,kisinumarasi=0;
        boolean aranankisibulundumu=false;
        String kisiadi="",aranankisi="",duzenlenecekkisibilgisi="";

        Scanner klavye =new Scanner(System.in);
        Scanner klavye2 =new Scanner(System.in);
        Scanner klavye3=new Scanner(System.in);
        Scanner klavye4=new Scanner(System.in);
        Scanner klavye5=new Scanner(System.in);
        Scanner klavye6=new Scanner(System.in);
        Scanner klavye7=new Scanner(System.in);
        Scanner klavye8=new Scanner(System.in);
        Scanner klavye9=new Scanner(System.in);



       do {
           System.out.println("Yapılacak işlemi seçiniz:");
           System.out.println("1.Kişi ekle");
           System.out.println("2.Kişileri Listele:");
           System.out.println("3.Kişi Arama");
           System.out.println("4.Kişi Silme");
           System.out.println("5.Kişi Düzenleme");
           secim = klavye.nextInt();


           switch (secim) {
               case 1:
                   if (index < 20) {
                       System.out.println("Kişi adını giriniz:");
                       kisiadi = klavye2.nextLine();
                       System.out.println("Kişi numarasını giriniz:");
                       kisinumarasi = klavye4.nextInt();

                       rehber[index][0] = index + 1 + "";
                       rehber[index][1] = kisiadi;
                       rehber[index][2] = kisinumarasi + "";
                       index++;
                   } else {
                       System.out.println("Hafıza dolu");
                   }
                   break;

               case 2:
                   if (index > 0) {
                       System.out.println("Kişi Listesi:");
                       for (int i = 0; i < index; i++) {
                           System.out.println(rehber[i][0] + " " + rehber[i][1] + " " + rehber[i][2]);

                       }
                   }
                   break;

               case 3:
                   aranankisibulundumu = false;
                   if (index > 0) {
                       System.out.println("Aranan kişi ismini giriniz:");
                       aranankisi = klavye3.nextLine();
                       for (int i = 0; i < index; i++) {
                           if (aranankisi.equals(rehber[i][1])) {
                               System.out.println("Kişi bilgileri:");
                               System.out.println(rehber[i][0] + " " + rehber[i][1] + " " + rehber[i][2]);
                               aranankisibulundumu = true;
                               break;
                           }
                       }
                       if (!aranankisibulundumu) {
                           System.out.println("Aranan kişi bulunamamıştır.");
                       }
                   } else {
                       System.out.println("Aranan kişi bulunamamıştır.");
                   }


                   break;
               case 4:
                   aranankisibulundumu = false;
                   if (index != 0) {
                       System.out.println("Silinecek kişinin adını giriniz.");
                       aranankisi = klavye5.next();

                       for (int i = 0; i < index; i++) {
                           if (aranankisi.equals(rehber[i][1])) {
                               for (int j = 0; j < index - 1; j++) {
                                   rehber[j][0] = (Integer.parseInt(rehber[j + 1][0]) - 1) + " ";
                                   rehber[j][1] = rehber[j + 1][1];
                                   rehber[j][2] = rehber[j + 1][2];
                               }
                               index--;
                               aranankisibulundumu = true;
                               break;
                           }
                       }
                       if (!aranankisibulundumu) {
                           System.out.println("Aradığınız kişi bulunamadı.");
                       }
                       } else {
                           System.out.println("Silmek için eklenmiş olması gerekmektedir.");

                       }
                       break;
                       case 5:
                           aranankisibulundumu = false;
                           if (index != 0) {
                               System.out.println("Düzenlenecek kişinin adını girniz.");
                               aranankisi = klavye6.next();
                               for (int i = 0; i < index; i++) {
                                   if (aranankisi.equals(rehber[i][1])) {
                                       System.out.println("Kişinin adınımı, numarasınımı düzenleyeceksiniz?");
                                       duzenlenecekkisibilgisi = klavye9.nextLine();
                                   }
                                   if (duzenlenecekkisibilgisi.equals("adi")) {
                                       System.out.println("Yeni adı giriniz:");
                                       rehber[i][1] = klavye7.nextLine();

                                   } else if (duzenlenecekkisibilgisi.equals("numarası")) {
                                       System.out.println("Yeni numarasını giriniz:");
                                       rehber[i][2] = klavye8.nextLine();

                                   } else {
                                       System.out.println("Yanlış bir ifade girdiniz.");
                                   }
                                   aranankisibulundumu = true;
                                   break;
                               }}
                                   if (!aranankisibulundumu) {
                                       System.out.println("Kişi bulunamadı.");

                               }
                               case 6:
                                   break;
                               default:
                                   System.out.println("Yanlış işlem yaptınız.");

                           }
                   }while (secim != 6) ;*/

        for (int i = 1; i < 5; i++)
        {
            for (int bosluk = 5; bosluk > i ; bosluk--)
            {
                System.out.print(" ");
            }

            for (int yildiz = 0; yildiz < (i*2)-1; yildiz++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }}

