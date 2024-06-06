package org.example;

public class Hexagono {
     public double result;
     public double lado;

    public Hexagono(double lado) {
        this.lado = lado;
    }

    public void calc_area(){
        double num = 3.0 / 4.0;
        result = 6 * lado * Math.sqrt(num);
        System.out.println(" A área do hexagono é:".toUpperCase()+result);

    }

    public void calc_perimetro(){
        result = lado * 6;
        System.out.println("O perimetro do hexagono é:".toLowerCase()+result);
    }
}
