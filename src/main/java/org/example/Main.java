package org.example;

import java.security.KeyStore;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String usuario = "";
        boolean validacao = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu nome:");
        usuario = sc.nextLine();

        int option;
        while (validacao == false) {

                System.out.println(usuario + " Digite:\n 1 para calcular figuras planas\n 2 para figuras espaciais  \n 3 para encerrar o programa");
                option = sc.nextInt();
                if (option == 1) {
                    int option_fig_plan;
                    System.out.println(usuario + " Insira um valor para selecionar uma figura plana: \n1- Quadrado \n2- Retangulo\n3- Triangulo Equilatero\n4- Circulo\n5- Hexagono Regular");
                     option_fig_plan = sc.nextInt();
                    switch (option_fig_plan) {
                        case 1:
                            try {
                                int lado;
                                System.out.println(usuario + " Insira o valor do lado do quadrado");
                                lado = sc.nextInt();
                                Quadrado quadrado = new Quadrado(lado);
                                quadrado.calc_area();
                                quadrado.calc_perimetro();
                                break;
                            } catch (Exception e) {
                                System.out.println("Insira um numero do tipo inteiro");
                            }
                        case 2:
                            try {
                                int lado_maior, lado_menor;
                                System.out.println(usuario + " Insira o valor do lado maior do retangulo");
                                lado_maior = sc.nextInt();
                                System.out.println(usuario + " Insira o valor do lado menor do retangulo");
                                lado_menor = sc.nextInt();
                                Retangulo retangulo = new Retangulo();
                                retangulo.calc_area(lado_maior, lado_menor);
                                retangulo.calc_perimetro(lado_maior, lado_menor);
                                break;
                            } catch (Exception e) {
                                System.out.println("Insira um numero do tipo inteiro");
                                break;
                            }
                        case 3:
                            try {
                                double lado_t;
                                System.out.println(usuario + " Insira o valor do lado do triangulo");
                                lado_t = sc.nextDouble();
                                Triangulo triangulo = new Triangulo();
                                triangulo.calc_area(lado_t);
                                triangulo.calc_perimetro(lado_t);
                                break;
                            } catch (Exception e) {
                                System.out.println("Insira um numero do tipo double");
                            }
                            break;
                        case 4:
                            try {
                                int raio;
                                System.out.println("Digite o valor do raio do Circulo:");
                                raio = sc.nextInt();
                                Circulo circulo = new Circulo();
                                circulo.calc_area(raio);
                                circulo.calc_circuferencia(raio);
                            } catch (Exception e) {
                                System.out.println("Insira um numero do tipo inteiro");
                            }
                            break;
                        case 5:
                            try {
                                int lado;
                                System.out.println("Digite o valor do lado  do Hexagono:");
                                lado = sc.nextInt();
                                Hexagono hexagono = new Hexagono(lado);
                                hexagono.calc_perimetro();
                                hexagono.calc_area();
                                break;
                            } catch (Exception e) {
                                System.out.println("Insira um numero do tipo inteiro");
                                break;
                            }
                        default:
                            System.out.println("Insira um numero valido");
                    }

                }
                else if (option == 2) {
                    int option_fig_esp;
                    System.out.println(usuario + " Insira um valor para selecionar uma figura espacial: \n1- Cilindro \n2- Cone\n3- Esfera\n4- Cubo\n5- Paralelepipedo \n6- Piramide");
                    option_fig_esp = sc.nextInt();

                    switch (option_fig_esp){
                        case 1:
                            try{
                                double altura;
                                double raio;
                                System.out.println(usuario +" Insira a altura do cilindro:");
                                altura = sc.nextDouble();
                                System.out.println(usuario +" Insira o raio do cilindro");
                                raio = sc.nextDouble();
                                Cilindro cilindro = new Cilindro();
                                cilindro.calc_volume(altura,raio);
                                cilindro.calc_area_superficial(altura,raio);

                                break;
                            }
                            catch (Exception e){
                                System.out.println("Insira um número válido");
                                break;
                            }
                        case 2:
                            try{
                                double altura;
                                double raio;
                                System.out.println(usuario +" Insira a altura do cone:");
                                altura = sc.nextDouble();
                                System.out.println(usuario +" Insira o raio do cone");
                                raio = sc.nextDouble();
                                Cone cone = new Cone();
                                cone.calc_volume(raio,altura);
                                cone.calc_area_superficial(raio,altura);
                                break;
                            }
                            catch (Exception e){
                                System.out.println("Insira um número válido");

                            }
                        case 3:
                            try{
                                double raio;
                                System.out.println(usuario +" Insira o raio da esfera");
                                raio = sc.nextDouble();
                                Esfera esfera = new Esfera(raio);
                                esfera.calc_area_superficial();
                                esfera.calc_volume();
                                break;
                            }
                            catch (Exception e){
                                System.out.println("Insira um número válido");

                            }

                        case 4:
                            try{
                                double lado;
                                System.out.println(usuario +" Insira o lado do cubo");
                                lado= sc.nextDouble();
                                Cubo cubo = new Cubo(lado);
                                cubo.calc_area_superficial();
                                cubo.calc_volume();
                                break;
                            }
                            catch (Exception e){
                                System.out.println("Insira um número válido");

                            }
                        case 5:
                            try{
                                int comprimento,altura,largura;
                                System.out.println(usuario +" Insira o comprimento do paralelepipedo");
                                comprimento = sc.nextInt();
                                System.out.println(usuario +" Insira a altura do paralelepipedo");
                                altura = sc.nextInt();
                                System.out.println(usuario +" Insira a largura do paralelepipedo");
                                largura = sc.nextInt();
                                Paralelepipedo paralelepipedo = new Paralelepipedo();
                                paralelepipedo.calc_volume(comprimento,altura,largura);
                                paralelepipedo.calc_area_superficial(comprimento,altura,largura);

                                break;
                            }
                            catch (Exception e){
                                System.out.println("Insira um número válido");

                            }
                        case 6:
                            try{
                                double aresta_base,altura,apotema;
                                System.out.println(usuario +" Insira a base da piramide de base quadrada:");
                                aresta_base = sc.nextDouble();
                                System.out.println(usuario +" Insira a altura  da base da piramide:");
                                altura = sc.nextDouble();
                                System.out.println(usuario +" Insira a apotema  da base da piramide:");
                                apotema = sc.nextDouble();
                                Piramide piramide = new Piramide();
                                piramide.calc_area_superficial(aresta_base,apotema);
                                piramide.calc_volume(aresta_base,altura);

                                break;
                            }
                            catch (Exception e){
                                System.out.println("Insira um número válido");

                            }
                    }

                }
                else if (option== 3) {
                    System.out.println("Encerrando o programa...");
                    validacao = true;

                }
                else {
                    System.out.println("Opcao invalida!");
                }
            }


        }
           }