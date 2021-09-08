package Parte02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exerc2 {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {

            var programacontinuaexec = true;
            var indice = new ArrayList<Integer>();
            var contnegativo = 0;
            var listanegativos = new ArrayList <Integer>();

            while (programacontinuaexec) {

                System.out.println("Digite um novo número");
                indice.add(in.nextInt());
                System.out.println("Deseja adicionar mais um número? [s], [n]");
                if (in.next().charAt(0) == 'n') {
                    programacontinuaexec = false;

                }

            }

            for (int i : indice){
                if (i < 0){
                    contnegativo ++;
                    listanegativos.add(i);
                }


            }
            System.out.println("A Lista de numeros negativos é: ");
            System.out.println(listanegativos);
            System.out.println("O total numeros de negativos é: " + contnegativo);
            System.out.println("Lista completa é:");
            System.out.println(indice);





        }


    }

}

