package com.company;

public class Cat {
    public Animal animal;
    Cat(String hayvanTuru, String hayvanCinsi, int hayvaninFiyati, int stokSayisi){
        animal= new Animal(hayvanTuru,hayvanCinsi,hayvaninFiyati,stokSayisi);
    }
public void giveMeSound(){
        System.out.println("Miyavvvv");
}

}
