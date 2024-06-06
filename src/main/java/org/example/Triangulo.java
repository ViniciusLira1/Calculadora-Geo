package org.example;

public class Triangulo {
    public double result;

    public void calc_area(double lado){
        double num = (3.0/4.0);

        result = lado * Math.sqrt(num);
        System.out.println("A área do triangulo é:".toUpperCase()+result);
    }

    public void calc_perimetro(double lado){
        result = lado * 3;
        System.out.println("O perimetro do Triangulo é:".toLowerCase()+result);
    }
}
