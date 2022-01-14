package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

       /* int sayi1 = klavye.nextInt();
       int sayi2 = klavye.nextInt();
q
        for (sayi1=0,sayi2=0; sayi1>sayi2; sayi1++);{
            if(sayi1%2==1);
            System.out.println(sayi1);*/

        int ctoplam= 0, ttoplam=0;
        int num;
        do {
            System.out.println("Bir sayı giriniz=");
            num = klavye.nextInt();
            if (num % 2 == 0)
            {
                System.out.println(ctoplam += num);
            }else

            System.out.println(ttoplam += num);
        }while (num!=0);

        System.out.println("Tek sayıların toplamı="+ttoplam);
        System.out.println("Çift sayıların toplamı="+ctoplam);


        }




    }
        //Girilen 2 sayı arasında bulunan tek ve çift sayıların toplamını bulup ayrı ayrı yazdıran programı yazınız.





