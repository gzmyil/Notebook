package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Daire mesa=new Daire();
        mesa.daireno=3;
        mesa.metrekare="150";
        mesa.setFiyat(3500000);
        System.out.println("Daire no= "+mesa.daireno+"\nMetrekare= "+mesa.metrekare+"\nFiyat= "+mesa.getFiyat());
        System.out.println("Şirket ismi= "+mesa.getProjename());

    }
}
