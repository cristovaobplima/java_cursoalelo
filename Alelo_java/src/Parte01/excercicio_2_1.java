package Parte01;

import java.util.Scanner;

public class excercicio_2_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Numero é par");
        }
        else {
            System.out.println("O numero é impar");
        }

        in.close();

    }

    }


