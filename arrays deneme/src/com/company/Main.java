package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        /*for (int i=0;i<6;i++){

    System.out.println(i+1);

    }*/
        /*Scanner klavye=new Scanner(System.in);

        System.out.println("Vize notunu giriniz:");
        int vize= klavye.nextInt();
        System.out.println("Final notunu giriniz:");
        int finalnotu= klavye.nextInt();
        int ortalama=(vize*40/100)+(finalnotu*60/100);
        System.out.println("Not ortalamanız:"+ortalama);

        if(ortalama<55){
            System.out.println("Kaldınız.Sınıf tekrarı.");
        }else
            System.out.println("Geçtiniz.Seneye bir üst sınıfta görüşmek üzere.");*/


// 100 den 1 e kadar tek sayılar

       /* for(int i=0; i<100; i++){

            System.out.println(2*i+1);
        }*/

//0-100 arası 3 ve 7 ile bölünebilen sayılar

        /*for(int i=0;i<100;i++){
            if(i%3==0 && i%7==0){
                System.out.println(i);
            }
        }*/

//2 nin üsleri
        /*int us=1;
        for (int i=0;i<10;i++){

            System.out.println(us);
            us=us*2;
        }*/

       /* for (int i = 0; i < 6; i++) {
            if (i % 5 == 0) {
                System.out.println(i);

            }
   }*/
        //iki dizinin çarpımı
       /* int[]a={1,2,3,4};
        int[]b={5,6,7,8};

        for(int i=0; i<4;i++){
            for (int j=0; j<4;j++){

                System.out.println(a[i]*b[j]);
            }
        }*/

        //matris çarpımı bu konuyu henüz çalışıyorum:)

      /*  int a[][]=new int [][]{{1,2},{3,4}};
        int b[][]=new int[][]{{5,6},{7,8}};

        for(int i=0; i<2;i++){
            for(int j=0; j<2;j++){
                System.out.println((a[i][j]*b[i][j]));
            }
        }*/

        //klavyeden değer girilerek çarpım

       /* Scanner klavye = new Scanner(System.in);

        System.out.println("A(m,n) dizisinin boyutlarını giriniz.");
        int m = klavye.nextInt();
        int n = klavye.nextInt();

        System.out.println("B(f,p) dizisinin boyutlarını giriniz. ");
        int f = klavye.nextInt();
        int p = klavye.nextInt();

        int A[][] = new int[m][n];
        int B[][] = new int[f][p];
        int C[][] = new int[m][p];
        int i;
        int j;
        int k;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                Scanner klavye2 = new Scanner(System.in);
                System.out.println("A matrisi" + (i+1) + (j+1) + " elemanını giriniz");
                A[i][j] = klavye2.nextInt();
            }
        }
        for (i = 0; i < f; i++) {
            for (j= 0; j < p; j++) {
                Scanner klavye3=new Scanner(System.in);
                System.out.println("B matrisinin"+(i+1) + (j+1)+ " .elemanını giriniz");
                B[i][j]= klavye3.nextInt();
            }
        } int h = 0;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                for (k = 0; k < 3; k++) {
                    h = h + (A[i][k] * B[k][j]);
                    C[i][j] = h;
                }
        } for(i=0;i<3;i++){
            for(j=0;j<3;j++) {

                System.out.println(h+"  ");
            }
        System.out.println("");
    }*/

Scanner klavye=new Scanner(System.in);
Scanner klavye1=new Scanner(System.in);
Scanner klavye2=new Scanner(System.in);
Scanner klavye3=new Scanner(System.in);

        String seyirciler[];
        int kisisayisi=0,gencbilet=10, normalbilet=20;
        String kisiadi,secim;
        int yas[];
        int kisiyasi=0;
        int toplam=0;

        System.out.println("Kişi sayısını giriniz.");
        kisisayisi= klavye.nextInt();

        if(kisisayisi>10){
            System.out.println("Yeterli koltuk bulunmamaktadır");
        }else if(kisisayisi<=0){
            System.out.println("Yanlış bir sayı girdiniz.");
        }else
            System.out.println("kişi isimlerini giriniz.");


        seyirciler=new String[kisisayisi];
        yas=new int[kisisayisi];

        for(int i=0;i<kisisayisi;i++){
            System.out.println((i+1)+".inci kişinin ismi:");
            kisiadi= klavye1.nextLine();
            seyirciler [i]=kisiadi;

            System.out.println((i+1)+". Yaşlarını giriniz:");
            kisiyasi= klavye2.nextInt();
            yas[i]=kisiyasi;
        }

        for(int j=0;j<kisisayisi;j++){
        if(yas[j]<18){
            toplam=toplam+gencbilet;

        }else
            toplam=toplam+normalbilet;
            System.out.println("Toplam bilet fiyatı="+toplam);


    }System.out.println("Devam etmek için N , çıkmak için Y tuşlayınız.");
        secim=klavye3.nextLine();

        switch (secim){
            case"N":
                System.out.println("Oturma düzeni:");
                for(int i=0; i<10;i++) {
                    if (i < kisisayisi) {
                        System.out.println((i + 1) + ".inci sırada " + seyirciler[i] + " oturuyor.");
                    } else
                        System.out.println((i + 1) + ". inci sıra boş");
                }break;
        case"Y":
            System.out.println("işleminiz sonlandırıldı.");
            default:
                System.out.println("Tekrar deneyiniz");

    }}}