package com.company;

public class Daire {
    public int daireno;
    public String metrekare;
    private int fiyat;

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    Daire() {
    }

    Daire(int daireno, String metrekare, String setFiyat) {
        this.daireno=daireno;
        this.metrekare=metrekare;

    }
    public String getProjename(){
        return "Mesa";
    }
}