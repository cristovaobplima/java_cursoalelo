package Parte02;
import java.util.ArrayList;
import java.util.Scanner;

public class Exerc3 {


    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {

            var programacontinuaexec = true;
            var indice = new ArrayList<Integer>();
            var contnegativo = 0;
            var contpares = 0;
            var listapares = new ArrayList<Integer>();


            while (programacontinuaexec) {

                System.out.println("Digite um novo número");
                indice.add(entrada.nextInt());
                System.out.println("Deseja adicionar mais um número? [s], [n]");
                if (entrada.next().charAt(0) == 'n') {
                    programacontinuaexec = false;

                }


                }

            for (int i : indice){
                if (i % 2 == 0){
                    contpares ++;
                    listapares.add(i);

                }

            }

            System.out.println("Lista de pares: ");
            System.out.println(listapares);
            System.out.println("total de pares é: " + contpares);

        }
    }

}
