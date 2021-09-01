package Parte01;

import java.util.Scanner;

public class exer_2_2 {

    public static void main(String[] args) {
        Scanner entradadenumero = new Scanner(System.in);
        System.out.println("Digite a idade do Aquamen");
        int aquamen = entradadenumero.nextInt();
        switch (aquamen) {
            case 5:
                System.out.println("aquamen kids A");
                break;
            case 6:
                System.out.println("aquamen kids A");
                break;
            case 7:
                System.out.println("aquamen kids A");
                break;
            case 8:
                System.out.println("aquamen kids B");
                break;
            case 9:
                System.out.println("aquamen kids B");
                break;
            case 10:
                System.out.println("aquamen kids B");
                break;
            case 11:
                System.out.println("aquamen kids B");
                break;
            case 12:
                System.out.println("aquamen juvenil A");
                break;
            case 13:
                System.out.println("aquamen junivel A");
                break;
            case 14:
                System.out.println("aquamen junivel B");
                break;
            case 15:
                System.out.println("aquamen junivel B");
                break;
            case 16:
                System.out.println("aquamen junivel B");
                break;
            case  17:
                System.out.println("aquamen juvenil B");
                break;
            default:
                System.out.println("aquamen adulto");

        }
        entradadenumero.close();
    }

}
