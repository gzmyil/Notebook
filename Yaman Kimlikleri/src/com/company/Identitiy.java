package com.company;

import java.util.Date;

public class Identitiy {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String name;
    public String surname;
    public String dogumyeri;
    public String tarih;

    Identitiy(){
    }
    Identitiy(String name,String surname,String dogumyeri, String tarih){
        this.name=name;
        this.surname=surname;
        this.dogumyeri=dogumyeri;
        this.tarih=tarih;
    }


}
