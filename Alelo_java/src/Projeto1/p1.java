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
        boolean iniciarPrograma = true;
        char executarPrograma;



        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao programa para consultar o saldo do cartao Farelo");


        while (iniciarPrograma) {
            System.out.println("Deseja lançar seus gastos? Digite 'S' para sim e 'N' para não e encerrar o programa");
            executarPrograma = scanner.next().charAt(0);
            if(executarPrograma == 'N'|| executarPrograma =='n') {
                iniciarPrograma = false;
                System.out.println("Programa Saldo Farelo Encerrado");
            }

             else if (executarPrograma == 'S' || executarPrograma == 's'){

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
                    valorGastorefeicao = scanner.nextDouble();
                    if (valorGastorefeicao <= saldoRefeicao) {
                        System.out.println("Sua compra foi aprovada");
                        saldoRefeicao = saldoRefeicao - valorGastorefeicao;
                    } else if (valorGastorefeicao > saldoRefeicao) {
                        System.out.println("Sua compra foi negada, pois falta saldo");
                    }

                }

                if (operacao == 3) {
                    System.out.println("Digite o valor da compra no cartão transporte: ");
                    valorGastotransporte = scanner.nextDouble();
                    if (valorGastotransporte <= saldoTransporte) {
                        System.out.println("Sua compra foi aprovada");
                        saldoTransporte = saldoTransporte - valorGastotransporte;
                    } else if (valorGastotransporte > saldoTransporte) {
                        System.out.println("Sua compra foi negada, pois falta saldo");

                    }
                }
                if(operacao == 4) {
                    iniciarPrograma = false;
                }

                System.out.println("Seu saldo do cartao alimentacao é = " + saldoAlimentacao);
                System.out.println("Seu saldo do cartao refeição é = " + saldoRefeicao);
                System.out.println("Seu saldo do cartao transporte é = " + saldoTransporte);



            }
             else {
                 System.out.println("Opção invalida");
                 iniciarPrograma = true;
             }



        }
        scanner.close();
    }

}







