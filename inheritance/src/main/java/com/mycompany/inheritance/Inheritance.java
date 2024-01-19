

package com.mycompany.inheritance;

public class Inheritance {

    public static void main(String[] args) {
      bola Bola= new bola(); 
      Bola.r = 7;  
      
      balok Balok= new balok();
      Balok.p = 8;
      Balok.l = 9;
      Balok.t = 4;
      
      LimasSegitiga LS = new LimasSegitiga();
      LS.s = 2;
      LS.t = 4;
      LS.ts = 3;
      
      tabung Tabung = new tabung();
      Tabung.r = 5;
      Tabung.t = 5;
      
      
      Bola.LuasPermukaan();
      Bola.volume();
      System.out.println(" ");
      Balok.LuasPermukaan();
      Balok.volume();
      System.out.println("  ");
      LS.LuasPermukaan();
      LS.volume();
      System.out.println("  ");
      Tabung.LuasPermukaan();
      Tabung.volume();
    }
}
