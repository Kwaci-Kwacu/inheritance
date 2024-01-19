
package com.mycompany.inheritance;

public class balok extends induk {
    double p;
    double l;
    double t;
    
    @Override
    double volume(){
    double hasil = p * l * t;
    System.out.println("HASIL VOLUME BALOK = "+hasil);
    return hasil;
}
    double LuasPermukaan(){
    double hasil = 2 * (p*l+(p*t)+(l*t));
    System.out.println("HASIL LUAS BALOK = "+hasil);
    return hasil;
}
}
