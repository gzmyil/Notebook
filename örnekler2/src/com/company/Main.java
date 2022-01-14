package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* int i;

        for (i = 0; i <= 10; i++) {

            if (i == 5)
                System.out.println(i * i);
            else if (i==7)
                System.out.println("sayi="+ (i+7));
            else
                System.out.println(i);

        }
        Scanner klavye = new Scanner(System.in);
        int i;
        int sayi;
        sayi= klavye.nextInt();
        for( i=1 ; i <= 20; i++){
            sayi++;
            System.out.println(sayi);*/

        //Girilen 2 sayı arasında bulunan tek ve çift sayıların toplamını bulup ayrı ayrı yazdıran programı yazınız.


        /*int toplam=0;
        int ttoplam=0;
        int ctoplam=0;
        Scanner klavye= new Scanner(System.in);
        int sayi1= klavye.nextInt();
        int sayi2= klavye.nextInt();
        for(int i = sayi1 ; i < sayi2 ; i++) {
            if (i%2==0) {
                ctoplam = ctoplam + i;
            }else if (i%2==1){
                ttoplam=ttoplam+i;
        }}
        System.out.println("çift toplam=" + ctoplam);
        System.out.println("tek toplam="+ ttoplam);*/


       /* Seçim menüsü oluşturarak dört işlemi yapabilen
        (bizim seçimize göre ve değerler kullanıcıdan alınacaktır.)
        sayıları karşılaştırabilen ve çıkış işlemi olan hesap makinesi programının kodunu yazınız.
       (Menü çıkış işlemi gerçekleşmediği sürece tekrar tekrar ekrana gelsin)*/


        Scanner klavye= new Scanner(System.in);


        int islem=0;

        do{
            System.out.println("Tablodan işlem seçiniz");
            System.out.println("1.TOPLAMA");
            System.out.println("2.Çıkarma");
            System.out.println("3.Çarpma");
            System.out.println("4.Bölme");
            System.out.println("5.Karşılaştırma");
            islem= klavye.nextInt();
            System.out.println("Birinci sayıyı giriniz=");
            int sayi1= klavye.nextInt();
            System.out.println("İkinci sayıyı giriniz=");
            int sayi2= klavye.nextInt();

            if(islem==1){
                System.out.println("Toplam="+(sayi1+sayi2));
            }else if(islem==2){
                System.out.println("Fark="+ (sayi1-sayi2));
            }else if(islem==3){
                System.out.println("Çarpım="+(sayi1*sayi2));
            }else if(islem==4){
                System.out.println("Bölüm="+(sayi1/sayi2));
            }else if(islem==5)

                if(sayi1>sayi2) {
                    System.out.println(sayi1+" "+"büyüktür"+" "+sayi2);
                }else if(sayi1<sayi2){
                    System.out.println(sayi2+" "+"büyüktür"+" "+sayi1);
                }else
                    System.out.println(sayi1+" "+"eşittir"+" "+sayi2);

        }while ( islem<6);



















    }}

