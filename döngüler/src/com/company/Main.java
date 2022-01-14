package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sayi= 0 , sayac=0;
        Scanner klavye= new Scanner(System.in);

        System.out.println("bölünecek sayıyı giriniz=");

        sayi= klavye.nextInt();

        for(int j=1; sayi>=j; j++){
            if ((sayi%j)==0 ){
                sayac++;

            }

        }
        if (sayac==2){
            System.out.println("Sayı asaldır" );
        }

    }
}
