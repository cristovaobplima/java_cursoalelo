package Parte01;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class exer2_6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String operacao1 = "pedra";
        String operacao2 = "papel";
        String operacao3 = "tesoura";

        System.out.println("Vamosjogar JokemmmmmmmPôoooo!!!");
        System.out.println("Player 1 qual a sua escolha? (pedra, papel ou tesoura)");
        String opcaoplayer1 = in.next();
        System.out.println("Player 2 qual a sua escolha? (pedra, papel ou tesoura)");
        String opcaoplayer2 = in.next();
        if (opcaoplayer1.equals(opcaoplayer2)) {
            System.out.println("Empate...");

        }
        else if (opcaoplayer1.equals(operacao1) && opcaoplayer2.equals(operacao2) || opcaoplayer1.equals(operacao2) && opcaoplayer2 .equals(operacao3) || opcaoplayer1.equals(operacao3) && opcaoplayer2.equals(operacao1)){
            System.out.println("Player 2 ganhou");

        }
        else {
            System.out.println("Player 1 ganhou");
        }



        in.close();

    }


}
