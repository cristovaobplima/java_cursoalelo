package Parte01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numero = scanner.nextInt();

        System.out.println("o antecessor do numero é:");
        System.out.println(numero - 1);
        scanner.close();

    }
}
