package Parte01;

import java.util.Scanner;

public class exer2_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual operação deseja fazer? (adicao, subtracao, multiplicacao e divisao)");

        String operacaoescolhida = in.next();
        String operacao1 = "adicao";
        String operacao2 = "subtracao";
        String operacao3 = "multiplicacao";
        String operacao4 = "divisao";

        System.out.println("digite o primeiro numero");
        int num1 = in.nextInt();

        System.out.println("digite o segundo numero");
        int num2 = in.nextInt();

        if (operacaoescolhida .equals(operacao1)) {
            System.out.println("o resultado da soma é: " + (num1 + num2));
            }
        else if (operacaoescolhida .equals(operacao2)){
            System.out.println("o resultado da subtracao e: " + (num1 - num2 ));
        }
        else if (operacaoescolhida .equals(operacao3)) {
            System.out.println("o resultado da multiplicacao e: " + (num1 * num2));
        }
        else  if (operacaoescolhida .equals(operacao4)) {
            System.out.println("o resultado da divisao e: " + (num1 / num2));
        }
        else {
            System.out.println("operação digitada é invalida");
        }





in.close();

    }


}
