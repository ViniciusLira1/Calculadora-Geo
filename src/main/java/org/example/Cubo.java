package org.example;

public class Cubo {
     public double  result;
    public double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public void calc_volume(){
        result = Math.pow(lado,3);
        System.out.println("A area do cubo é:".toUpperCase()+result);
    }
    public void calc_area_superficial(){
        result = (lado * lado) * 6;
        System.out.println("A area superficial do cubo é:".toLowerCase()+result);
    }
}
