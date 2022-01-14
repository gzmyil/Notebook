package com.company;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
      String str="Bunu dosyaya yazdır";
      File file=new File("dosya.txt");
      if(!file.exists()){
          file.createNewFile();
      }
        FileWriter fileWriter= new FileWriter(file,false);
        BufferedWriter bWritwer=new BufferedWriter(fileWriter);
        bWritwer.write(str);
        bWritwer.close();

        FileReader fileReader=new FileReader(file);
        String line;
        BufferedReader br=new BufferedReader(fileReader);
        while ((line= br.readLine())!=null) {
          System.out.println(line);
        }
        br.close();

        String yazi= "Umay 2 yaşındadır.";

      System.out.println(yazi.length());

      System.out.println(yazi.indexOf("yaşındadır"));

      System.out.println(yazi.substring(5,7));

      System.out.println(("Umay").toUpperCase(Locale.ROOT));

      System.out.println(("Umay").toLowerCase(Locale.ROOT));

      if(yazi.endsWith("dadır.")) {
        System.out.println("Yes");
      }
      if(yazi.startsWith("Umay")) {
        System.out.println("Yes");
      }
      if(yazi.contains("2")){
        System.out.println("All right");
      }

      





    }

}
