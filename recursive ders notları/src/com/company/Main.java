package com.company;

import java.util.Scanner;

/*class metodlar6{

        static void PuanHesapla(double vize,double fınal) {

            double ortalama;
            ortalama = (vize * 4 / 10) + (fınal * 6 / 10);
            System.out.println("Ortalamanız= " + ortalama);
            if (ortalama < 60) {
                System.out.println("Sınıf tekrarına kaldınız");
            } else {
                System.out.println("Sınıfı Geçtiniz.");
            }
        }
    public static void main (String[]args) {

        Scanner klavye = new Scanner(System.in);
        double vize, fınal;
        for (int i = 0; i < 10; i++) {
            System.out.println("Öğrencinin vize notunu giriniz:");
            vize = klavye.nextInt();
            System.out.println("Öğrencinin final notunu giriniz:");
            fınal = klavye.nextInt();
            PuanHesapla(vize, fınal);
        }
*/


/*class Overloading3{
    static void goster(int sayi1,int sayi2){
        System.out.println("1.SaYI="+ sayi1);
        System.out.println("2.Sayi="+sayi2);
    }
    static void goster(int sayi1,String isim){
        System.out.println("İsim="+isim);
        System.out.println("Sayı="+sayi1);
    }
    public static void main(String[]args){
        goster(53,25);
        goster(25,"KOD BLOKLARI");
    }*/

//public class Main {


        //public static void main(String[] args) {
        // write your code here
        //Scanner klavye=new Scanner(System.in);
    /*    for(int i=0; i<5; i++){
            System.out.println(i+"");
    }

        degerleriYazdir();

    }
    public static void degerleriYazdir(){
        for(int i=0;i<5;i++){
            System.out.println(i+"");
        }

    }
    public static int recursiveDegerleriYazdir(int i) {
        if (i < 5) {
            System.out.println(i + "");
            i++;
return recursiveDegerleriYazdir(i);

        }else {
            return 0;
        }

       // public static void ekranaYaziYazVoid(){
       //        System.out.println("Ekrana yazı void yazalım.");
       //    }}*/



   /* public static int ekranaYaziYaz(){
        int sayi=5;
        System.out.println("Ekrana yazı yazdım." );
        return sayi;

    }
public static void main(String[] args){

        ekranaYaziYaz();
        int result=ekranaYaziYaz();
        System.out.println(result+"");
        gelenDegeriEkranaYaz(15);
        int toplamResult= gelenDegerleriToplaVeGonder(27,45);
        System.out.println("Gelen Değerlerin Toplamı:");

}

    ekranaYaziYaz();


    private static void gelenDegeriEkranaYaz(int gelenDeger){
        System.out.println("Gelen Değer"+ gelenDeger+"");
    }
    public static void gelenDegeriEkranaYaz(int gelenDeger){
        System.out.println("Gelen Değer+gelenDeger+");
}
    public static int gelenDegerleriToplaVeGonder(int sayi1, int sayi2){
        int toplam=0;
        toplam=sayi1+sayi2;
        return toplam;*/

        /*Scanner reader=new Scanner(System.in);
        System.out.println("Bir sayı girin:");
        int num=reader.nextInt();
        int sayac=num;
        long faktoriyel=1;
        for(int i=1;i<=num;i++){
            faktoriyel*=i;
            System.out.printf("%d Sayısının faktöriyeli=%d\n",num,faktoriyel);
        }*/

        /*Scanner scan=new Scanner(System.in);
        int toplam=0;
        int[]dizi=new int[10];
        for(int i=0;i<10;i++){
            System.out.println("Dizinin "+(i+1)+". elemanını giriniz.");
            dizi[i]= scan.nextInt();
            toplam+=dizi[i];
        }
        System.out.println("Dizinin ortalaması:"+(toplam/10));*/

        /*int[]dizi=new int[10];
        int enbuyuk=0;int enkucuk=0;
        for(int i=0; i<10;i++){
        System.out.println("Dizinin" +(i+1)+" . elemanını giriniz.");
        dizi[i]= klavye.nextInt();
        if(i==0){
            enbuyuk=dizi[i];
            enkucuk=dizi[i];
        }if (dizi[i]>enbuyuk){
            enbuyuk=dizi[i];

            }if(dizi[i]<enkucuk){
            enkucuk=dizi[i];
            }
}System.out.println("Dizinin en büyük elemanı: " +enbuyuk);
        System.out.println("Dizinin en küçük elemanı: "+enkucuk);
System.out.println("Fark= "+(enbuyuk-enkucuk));*/

      /*  int [][]dizi= new int[5][2];
        for(int i=0; i<5;i++){
            for(int j=0;j<2;j++){
                System.out.println("Bir sayı giriniz.");
                dizi[i][j]=klavye.nextInt();

                     }
        }for (int i=0;i<5;i++){
            for(int j=0;j<2;j++){
                System.out.println((i+1)+". Dizi elemanları: "+dizi[i][j]);
            }
            System.out.println("\n");
        }*/

        /*???
        int[][]dizi=new int[5][3];
        int toplam = 0;
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                System.out.println("Bir sayı giriniz:");
                dizi[i][j]= klavye.nextInt();
            }
        }for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                toplam=0;
                toplam+=dizi[i][j];
                System.out.println(dizi[i][j]+"\t");

        }System.out.println(toplam+"\n");
        }*/


        //}}
    /*public class IkiSayiyiCarp {
        static void carp(int sayi1, int sayi2){
            System.out.println("Sayıların carpımı="+(sayi1*sayi2));
        }
        public static void main(String[]args){
            carp(15,5);
        }
    }*/
   // }}

class metodlar6 {
    static void PuanHesaplama(double vize, double fınal) {
        double ortalama;
        ortalama = (vize * 4 / 10) + (fınal * 4 / 10);
        System.out.println("Ortalamanız= " + ortalama);

        if (ortalama < 60) {
            System.out.println("Sınıf tekrarına kaldınız.");
        } else {
            System.out.println("Sınıfı Geçtiniz.Tebrikler");
        }return ;
    }

    public static void main(String[] args) {
        double vize = 0;
        double fınal = 0;
        double ortalama = 0;
        String adi = " ";
        int index=0 ;
        String dizi[][] = new String[10][3];

        Scanner klavye = new Scanner(System.in);
        if (index < 3) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Öğrencinin adını giriniz: ");
                adi = klavye.nextLine();


            for (int j= 0; j < 3; j++) {

                System.out.println("Öğrencinin vize notunu giriniz= ");
                vize = klavye.nextInt();
                System.out.println("Öğrencinin final notunu giriniz=");
                fınal = klavye.nextInt();
                PuanHesaplama(vize, fınal);
                dizi[index][0] = String.valueOf(index + 1);
                dizi[index][1] = adi;
                dizi[index][2] =PuanHesaplama(vize,fınal)+" ";
                System.out.println(dizi[index][0]+dizi[index][1]+dizi[index][2]);

            } }
        }
    }
}