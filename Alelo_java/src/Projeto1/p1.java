package Projeto1;

import java.util.Scanner;

public class p1 {

    public static void main(String[] args) {

        //char operacao = in.next().charAt(0);

        double saldoAlimentacao = 0.0;
        double saldoTransporte = 0.0;
        double saldoRefeicao = 0.0;
        double valorGastoalimentacao = 0.0;
        double valorGastorefeicao = 0.0;
        double valorGastotransporte = 0.0;
        int operacao = 0;
        boolean iniciarPrograma = false;
        String executarPrograma = null;



        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao programa para consultar o saldo do cartao Farelo");
        System.out.println("Deseja lançar seus gastor? Disite SIM para lançar e NÃO para encerrar o programa");

        while (iniciarPrograma) {
            if (executarPrograma == "NÃO") {
                iniciarPrograma = false;
                System.out.println("Programa Saldo Farelo Encerrado");
            } else {

                System.out.println("Digite os valores do saldo de cada beneficio que serão usados:");

                System.out.println("Digite o saldo do vale alimentação:");
                saldoAlimentacao = scanner.nextDouble();

                System.out.println("Digite o saldo do vale transporte:");
                saldoTransporte = scanner.nextDouble();

                System.out.println("Digite o saldo do vale refeição:");
                saldoRefeicao = scanner.nextDouble();


                System.out.println("Escolha qual transação deseja fazer:");
                System.out.println("1 - Alimentação, 2 - Refeição, 3 - Transporte e 4 - Encerrar Programa");
                operacao = scanner.nextInt();

                if (operacao == 1) {
                    System.out.println("Digite o valor da compra no cartão alimentação: ");
                    valorGastoalimentacao = scanner.nextDouble();
                    if (valorGastoalimentacao <= saldoAlimentacao) {
                        System.out.println("Sua compra foi aprovada");
                        saldoAlimentacao = saldoAlimentacao - valorGastoalimentacao;
                    } else if (valorGastoalimentacao > saldoAlimentacao) {
                        System.out.println("Sua compra foi negada, pois falta saldo");
                    }
                }

                if (operacao == 2) {
                    System.out.println("Digite o valor da compra no cartão refeição: ");
                    valorGastoalimentacao = scanner.nextDouble();
                    if (valorGastoalimentacao <= saldoRefeicao) {
                        System.out.println("Sua compra foi aprovada");
                        saldoRefeicao = saldoRefeicao - valorGastorefeicao;
                    } else if (valorGastorefeicao > saldoRefeicao) {
                        System.out.println("Sua compra foi negada, pois falta saldo");
                    }

                }

                if (operacao == 3) {
                    System.out.println("Digite o valor da compra no cartão transporte: ");
                    valorGastoalimentacao = scanner.nextDouble();
                    if (valorGastoalimentacao <= saldoRefeicao) {
                        System.out.println("Sua compra foi aprovada");
                        saldoTransporte = saldoTransporte - valorGastotransporte;
                    } else if (valorGastorefeicao > saldoRefeicao) {
                        System.out.println("Sua compra foi negada, pois falta saldo");

                    }
                }


                System.out.println("Seu saldo do cartao alimentacao é = " + saldoAlimentacao);
                System.out.println("Seu saldo do cartao refeição é = " + saldoRefeicao);
                System.out.println("Seu saldo do cartao transporte é = " + saldoTransporte);


                scanner.close();
            }


        }

    }

}






