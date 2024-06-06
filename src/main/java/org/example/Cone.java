package org.example;

public class Cone {
    public double result;
    public void calc_volume(double raio, double altura){
         double num = 1/3;
        result = (num) * Math.PI * Math.pow(raio,2) * altura;
        System.out.println("O volume do cone é :".toUpperCase()+result);
    }
    public void calc_area_superficial(double raio,double altura){
        result = Math.PI * raio * Math.sqrt(Math.pow(altura,2) + Math.pow(raio,2));
        System.out.println("A area superficial do cone é:".toLowerCase()+result);
    }
}
