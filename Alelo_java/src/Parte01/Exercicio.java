package Parte01;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Vamos calcular a area do retangulo!!!");

        System.out.println("digite o valor da base");
        double base = scanner.nextDouble();

        System.out.println("digite o valor da altura");
        double altura = scanner.nextDouble();


        System.out.println("O calculo da area é:    " + base * altura +     ":)");


        scanner.close();

    }
}
