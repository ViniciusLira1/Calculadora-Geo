package org.example;

public class Circulo {
    public double result;

    public void calc_area(int raio){
       result = Math.PI * Math.pow(raio,2);
        System.out.println("O resultado da area do Circulo é:".toUpperCase()+result);

    }
    public void calc_circuferencia(int raio){
        result = 2 * Math.PI * raio;
        System.out.println("A circuferencia do circulo é:".toLowerCase()+result);

    }
}
