package org.example;

public class Piramide {
    public  double result;


    public  void calc_volume(double aresta_base, double altura){
        result = ((aresta_base * aresta_base )* altura)/3;
        System.out.println("O volume da piramide de base quadrada é:".toUpperCase()+result);
    }
    public void calc_area_superficial(double aresta_base,double apotema){
        result = (2 * aresta_base * apotema) + Math.pow(aresta_base,2);
        System.out.println("A area superficial da piramide de base quadrada é:".toLowerCase()+result);
    }
}
