package com.company;

public class Animal {
    public String hayvanTuru;
    public String hayvanCinsi;
    private int hayvaninFiyati;
    public boolean stokDurumu;
    public int stokSayisi;
    public boolean islemBasarilimi;
    public int kazanilanPara;

    Animal(){
    }

    Animal(String hayvanturu, String hayvanCinsi, int hayvaninFiyati){
        if(hayvaninFiyati==0){
            System.out.println("Hayvanın Fiyatı 0 olamaz.");
            this.islemBasarilimi=false;
        }
        else{
            this.hayvanTuru=hayvanTuru;
            this.hayvanCinsi=hayvanCinsi;
            this.hayvaninFiyati=hayvaninFiyati;
            this.islemBasarilimi=true;
        }
    }
    Animal(String hayvanTuru, String hayvanCinsi, int hayvaniniyati, int stokSayisi){
        if(hayvaninFiyati==0){
            System.out.println("Hayvanın Fiyatı 0 olamaz.");
            this.islemBasarilimi=false;

        }else{
            this.hayvanTuru=hayvanTuru;
            this.hayvanCinsi=hayvanCinsi;
            this.hayvaninFiyati=hayvaninFiyati;
            this.stokSayisi=stokSayisi;
            if (stokSayisi>0){
                this.stokDurumu=true;

            }else{
                this.stokDurumu=false;
            }
            this.islemBasarilimi=true;
        }
    }
    public int getHayvaninFiyati() {

        return hayvaninFiyati;
    }
    public void setHayvaninFiyati(int hayvaninFiyati){
        if (hayvaninFiyati==0){
            System.out.println("Fiyat 0 dan farklı olmalıdır.");
        }else{
            this.hayvaninFiyati=hayvaninFiyati;
        }
    }
    public boolean sell(){
        if (stokDurumu){
            stokSayisi--;
            kazanilanParaFunc(1);
            if (stokSayisi>0){
                stokDurumu=true;
            }else{
                stokDurumu=false;

            }
        }return stokDurumu;
    }
    private void kazanilanParaFunc(int satismik){

        this.kazanilanPara=satismik*hayvaninFiyati+ this.kazanilanPara;
    }

    public int getKazanilanPara(){

        return kazanilanPara;
    }
}
















