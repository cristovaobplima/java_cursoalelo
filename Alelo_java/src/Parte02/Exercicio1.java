package Parte02;

import java.util.ArrayList;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {


        try (Scanner in = new Scanner(System.in)) {


            var programacontinuaexec = true;
            var indice = new ArrayList<Integer>();



            while (programacontinuaexec) {
                System.out.println("Digite um novo número");
                indice.add(in.nextInt());

                System.out.println("Deseja adicionar mais um número? [s], [n]");
                if (in.next().charAt(0) == 'n') {
                    programacontinuaexec = false;
                }
            }

            System.out.println(indice);
        }


    }

    public static void comArray() {
        // Escreva um algoritmo que leia números insira em um array e após mostre os números informados na tela.


        // Usando o try, vc não precisa fechar o scanner manualmente.
        // Essa técnica se chama try with resources.

        try (Scanner in = new Scanner(System.in)) {
            var programaDeveContinuarExecutando = true;
            var indice = 0;

            var numeros = new Integer[10];

            while (programaDeveContinuarExecutando && indice < 10) {
                System.out.println("Digite um novo número");
                numeros[indice] = in.nextInt();

                System.out.println("Deseja adicionar mais um número? [s], [n]");
                if (in.next().charAt(0) == 'n') {
                    programaDeveContinuarExecutando = false;
                }
                indice++;
            }

            for (Integer item : numeros) {
                if (item != null && item < 0) {
                    System.out.print(item + " ");
                }
            }
            System.out.println("");
        }


    }





        }






