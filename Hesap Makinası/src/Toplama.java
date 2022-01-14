public class Toplama {
   public int sayi1;
   public int sayi2;
   public int toplam;
   public int secim;
   public boolean control;

      Toplama(){

}
      Toplama(int sayi1,int sayi2){
         if(secim==1){
            System.out.println("Toplam: "+(sayi1+sayi2));
            this.control=true;
         }else{
            this.control=false;
         }
         if(secim==2){
            System.out.println("Fark: "+(sayi2-sayi1));
            this.control=true;
         }else{
            this.control=false;
         }
      }


   }


