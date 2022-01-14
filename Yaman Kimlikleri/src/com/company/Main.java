package com.company;

public class Main {

    public static void main(String[] args) {
        BusCard Yaman =new BusCard();
        Yaman.setId(29123647);
        Yaman.name="Yaman";
        Yaman.surname="Öztürk";
        Yaman.tarih="03.01.1988";
        Yaman.dogumyeri="Aydın";
        Yaman.getokul("Cumhuriyet Lisesi");
        Yaman.getCardTipi("Öğrenci");
        System.out.println("Id= "+Yaman.getId()+" Adı= "+Yaman.name+" Soyadı= "+Yaman.surname+" Doğum Tarihi= "+Yaman.tarih+" Doğum yeri= "+Yaman.dogumyeri);

    }
}
