package org.example;

public class Cilindro {
    public double result;

    public void calc_volume(double altura,double raio){
        result = Math.PI * altura * Math.pow(raio,2);



            System.out.println("o volume do cilindro :".toUpperCase()+result );

        }


    public void calc_area_superficial(double raio, double altura){
        result = Math.PI * raio * Math.sqrt((Math.pow(altura,2) + (Math.pow(raio,2))));
        System.out.println("A area superficial do cilindro é:".toLowerCase()+result);
    }
}
