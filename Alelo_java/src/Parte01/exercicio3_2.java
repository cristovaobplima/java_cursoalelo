package Parte01;

import java.util.Scanner;

public class exercicio3_2 {

    public static void main(String[] args) {


        int maiorNumero = Integer.MIN_VALUE;
        int menorNumero = Integer.MAX_VALUE;

        double somaDosNumeros = 0;
        int numeroCorrente = 0;


        Scanner scanner = new Scanner(System.in);


        int quantiadeDeNumeros = 5;

        for (int contador = 1; contador <=quantiadeDeNumeros; contador++) {
            System.out.printf("Digite o %dº número", contador);

            numeroCorrente = scanner.nextInt();

            if (numeroCorrente > maiorNumero) {
                maiorNumero = numeroCorrente;
            }

            if (numeroCorrente < menorNumero) {
                menorNumero = numeroCorrente;
            }

            System.out.println(contador);


            somaDosNumeros = somaDosNumeros + numeroCorrente;
        }

        System.out.println("Maior número " + maiorNumero);
        System.out.println("Menor número " + menorNumero);
        System.out.println("Média " + somaDosNumeros);

        scanner.close();


    }


}
