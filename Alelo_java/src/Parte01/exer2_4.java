package Parte01;

import java.util.Scanner;

public class exer2_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        int num1 = in.nextInt();
        System.out.println("digite o segundo numero");
        int num2 = in.nextInt();
        System.out.println("digite o terceiro numero");
        int num3 = in.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("o primeiro é o maior");
        }else if (num2 > num1 && num2 > num3) {
            System.out.println("o segundo é o maior");
        }
        else{
            System.out.println("o terceiro é o maior");

        }
        if (num1 < num2 && num1 < num3){
            System.out.println("o primeiro é o menor");
            }
        else if(num2 < num1 && num2 < num3){
            System.out.println("o segundo é menor");
        }
        else {
            System.out.println("o terceiro é o menor");
        }
        System.out.println("A media dos valores é " + (num1 + num2 + num3 / 3));

        in.close();





    }









}
