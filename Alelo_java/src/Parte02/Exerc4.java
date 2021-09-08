package Parte02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exerc4 {


    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {

            var programacontinuaexec = true;
            var indice = new ArrayList<Integer>();
            //int mnumero = Integer.MIN_VALUE;
            var maiornum = Integer.MIN_VALUE;
            var listamaiornum = new ArrayList<Integer>();
            var executarPrograma = true;

            while (executarPrograma){

                System.out.println("Digite um numero: ");
                indice.add(entrada.nextInt());
                System.out.println("Deseja adicionar mais um número? [s], [n]");
                if (entrada.next().charAt(0) == 'n') {
                    programacontinuaexec = false;

            }










        }

    }
}