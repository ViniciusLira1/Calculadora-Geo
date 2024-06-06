package org.example;

public class Quadrado {

    public int result;
    public int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public void calc_area(){
        this.result = lado * lado;
        System.out.println("A area do quadrado é:".toUpperCase()+result);
    }
    public void calc_perimetro(){
        this.result = lado + lado + lado +lado;
        System.out.println("O perimetro do quadrado é:".toLowerCase()+result);
    }

}
