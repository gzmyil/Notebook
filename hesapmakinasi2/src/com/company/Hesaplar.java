package com.company;

public class Hesaplar {
    private int sayi1;
    private int sayi2;
    private int toplam;

    Hesaplar() {
    }

    public void topla(){
        this.toplam = sayi1 + sayi2;
    }

    public int getSayi1() {
        return sayi1;
    }

    public void setSayi1(int sayi1) {
        this.sayi1 = sayi1;
    }

    public int getSayi2() {
        return sayi2;
    }

    public void setSayi2(int sayi2) {
        this.sayi2 = sayi2;
    }

    public int getToplam() {
        return toplam;
    }

    public void setToplam(int toplam) {
        this.toplam = toplam;
    }
}
