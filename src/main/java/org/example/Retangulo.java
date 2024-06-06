package org.example;

public class Retangulo {

    public int result;
    public void calc_area( int lado_maior, int lado_menor){
        this.result = lado_maior * lado_menor;
        System.out.println("A area do retangulo é:".toUpperCase()+result);
    }
    public void calc_perimetro(int lado_maior,int lado_menor){
        this.result = lado_maior + lado_maior + lado_menor +lado_menor;
        System.out.println("O perimetro do retangulo é:".toLowerCase()+result);
    }

}
