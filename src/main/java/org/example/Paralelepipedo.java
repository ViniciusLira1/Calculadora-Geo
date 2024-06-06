package org.example;

public class Paralelepipedo {

    public int result;
    public void calc_volume(int comprimento ,int altura,int largura){
        result = comprimento * altura * largura;
        System.out.println("O volume do paralelepipedo é: ".toUpperCase()+result);
    }
    public void calc_area_superficial(int comprimento,int altura,int largura){
        result = 2 * ((comprimento * altura) + (altura* largura)+ (comprimento * largura));
        System.out.println("A area superficial do paralelepipedo e: ".toLowerCase()+ result);
    }
}
