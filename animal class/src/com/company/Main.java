package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal hayvanlar = sendHayvan();

        System.out.println(hayvanlar.hayvanTuru + " " + hayvanlar.hayvanCinsi + " barındırır.");
        //hayvanlar = sendHayvan2();

        hayvanlar.setHayvaninFiyati(40);
        if (hayvanlar.islemBasarilimi) {
            System.out.println("2 " + hayvanlar.hayvanTuru + " " + hayvanlar.hayvanCinsi + " barındırır.");
        }
        Animal monkey = new Animal("Maymun", "Lemur", 2200, 12231);

        System.out.println(hayvanlar.hayvanTuru);
        System.out.println(monkey.hayvanTuru);

        int i = 0;
        while (i < 20) {
            boolean sonuc = monkey.sell();

            if (sonuc) {
                System.out.println("Satış Başarıyla tamamlandı.");
            } else {
                System.out.println("Stokta ürün kalmadı.");
            }
            i++;
        }
        System.out.println(monkey.stokSayisi);
        System.out.println("Kazanılan Para " + monkey.getKazanilanPara());

        Animal lion = new Animal("Kedi", "Aslan", 5100, 23223);
        System.out.println(lion.hayvanCinsi);
        i = 0;
        while (i < 40) {
            boolean sonuc = lion.sell();

            if (sonuc) {
                System.out.println("Satış Başarıyla tamamlandı.");
            } else {
                System.out.println("Stokta ürün kalmadı.");
            }
            i++;
        }
        System.out.println(lion.stokSayisi);
        System.out.println("Kazanılan Para" + lion.getKazanilanPara());

        Animal cat = new Animal("Kedi", "Van Kedisi", 2890);
        System.out.println(cat.hayvanCinsi);

        Cat cat2 = new Cat("Kedi", "Van Kedisi2", 2890, 2131);
        System.out.println(cat2.animal.hayvanCinsi);
        cat2.giveMeSound();
        i = 0;
        while (i < 28) {
            boolean sonuc = cat2.animal.sell();
            i++;
        }
        System.out.println("Satılan kediler" + cat2.animal.getKazanilanPara());

        Animal dog2 = new Dog();
        dog2.hayvanTuru = "Köpek";
        dog2.hayvanCinsi = "Kangal";
        System.out.println(dog2.hayvanCinsi);
        System.out.println("Satış öncesi" + dog2.getKazanilanPara());

        boolean sonuc = dog2.sell();
        if (sonuc) {
            System.out.println("Satış Başarıyla Tamamlandı.");
        } else {
            System.out.println("Stokta ürün kalmadı.");
        }
        System.out.println("Satış sonrası" + dog2.getKazanilanPara());

        Dog dog3 = new Dog();
        dog3.giveMeSound();

        Animal mouse = new Mouse();
        mouse.hayvanTuru = "Fare";
        mouse.hayvanCinsi = "Hamster";
        System.out.println(mouse.hayvanCinsi);

        Rodent mouse1 = new Mouse();
        mouse1.hayvanTuru = "Fare1";
        mouse1.hayvanCinsi = "Hamster1";
        System.out.println(mouse1.hayvanCinsi);
        mouse1.iamhereRodent();

        Mouse mouse2 = new Mouse();
        mouse2.hayvanTuru = "Fare2";
        mouse2.hayvanCinsi = "Hamster1";
        System.out.println(mouse2.hayvanCinsi);
        mouse2.iamhereRodent();
        mouse2.giveMeSound();
        mouse2.soundcheck();

        Rabbit rabbit = new Rabbit();

        rabbit.hayvanTuru = "Tavşan";
        rabbit.hayvanCinsi = "Dilek Tavşanı";
        System.out.println(rabbit.hayvanCinsi);
        rabbit.iamhereRodent();
        rabbit.soundcheck();

    }
    public static Animal sendHayvan(){
        Animal hayvan=new Animal();

        hayvan.hayvanTuru="Hayvanlar";
        hayvan.hayvanCinsi="Tüm Hayvanlar";

        return hayvan;
    }

    }
