
package com.mycompany.inheritance;


public class LimasSegitiga extends induk {
    double s ;
    double t ;
    double ts ;
    
    @Override
    double volume(){
    double hasil = ( s*s )*t/3;
    System.out.println("HASIL VOLUMA LIMAS SEGITIGA = "+hasil);
    return hasil;
}
    
    double LuasPermukaan(){
    double hasil = ( s*s ) + ( 4*s*ts/2 );
    System.out.println("HASIL HASIL LUAS LIMAS SEGITIGA = "+hasil);
    return hasil;
}
}




