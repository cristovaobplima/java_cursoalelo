package Parte01;

import java.util.Scanner;

public class exercicio2_3 {
    public static void main(String[] args) {

Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int num1 = in.nextInt();
        System.out.println("digite o segundo numero");
        int num2 = in.nextInt();
    if (num1 == num2) {
        System.out.println("os dois são iguais");
    }
    else if (num1 < num2) {
        System.out.println("o primeiro é o menor");
    }
    else {
        System.out.println("o segundo é o menor");

    }
in.close();
    }





}
