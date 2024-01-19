/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author victu
 */
public class tabung extends induk{
    double t;
    double r;
    
    
    @Override
    double volume(){
    double hasil = Math.PI * r*r * t;
    System.out.println("HASIL VOLUME TABUNG = "+hasil);
    return hasil;
}
    double LuasPermukaan(){
    double hasil = 2 * Math.PI * r * (r * t);
    System.out.println("HASIL LUAS TABUNG = "+hasil);
    return hasil;
}
}
