package Parte01;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Resultado das Eleições em Maniconio City");

        System.out.println("digite o numero total de habitantes");
        int nhabitantes = entrada.nextInt();

        System.out.println("digite o numero de votos validos");
        int nvalidos = entrada.nextInt();

        System.out.println("digite o numero de votos em branco");
        int nbrancos = entrada.nextInt();

        System.out.println("digite o numero de votos nulos");
        int nnulos = entrada.nextInt();

        int totalvotos = nbrancos + nnulos + nvalidos;

        System.out.println("o total de votos validos foi de "+ nvalidos * 100.00f / nhabitantes + "% dos habitantes de ManiconioCity");

        System.out.println("o total de votos em branco foi de" + nbrancos * 100.00f / nhabitantes + "% dos habitantes de ManiconioCity");

        System.out.println("o total e votos nulos foi de" + nnulos * 100.00f / nhabitantes + "% dos habitantes de ManiconioCity");

        System.out.println("o total de cabuloes da eleição foi de: ");

        System.out.println(nhabitantes - totalvotos);

        entrada.close();
    }
}
