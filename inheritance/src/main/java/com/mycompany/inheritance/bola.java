
package com.mycompany.inheritance;

public class bola extends induk{
    
    double r ;
    
    @Override
    double volume(){
    double hasil = 4 * Math.PI *r*r*r/3;
    System.out.println("HASIL VOLUME BOLA = "+hasil);
    return hasil;
}
    
    double LuasPermukaan(){
    double hasil = 4 * Math.PI *r*r;
    System.out.println("HASIL LUAS BOLA = "+hasil);
    return hasil;
}
}