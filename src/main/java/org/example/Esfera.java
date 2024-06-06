package org.example;

public class Esfera {
    public  double result;
    public double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public void calc_volume( ){
        double num = 4/3;
        result = (num *Math.PI) * Math.pow(raio,3);
        System.out.println("O volume da esfera é ".toUpperCase() +result);
    }
    public void calc_area_superficial(){
        result = (4 * Math.PI) * Math.pow(raio,2);
        System.out.println("A area superficial da esfera é:".toLowerCase()+result);
    }
}
