package caseAleloCodigoSemBarreira;

import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Portador {


   public static LocalDateTime DataNasc_portador;
    public static String nomePortador;
    public static Integer CPF_portador;
    public static Statement state = null;



    public Portador() {
    }



    public static void cadastroPortador() {

        String nomePortador2;
        Integer CPF_portador2;


        Scanner in = new Scanner(System.in);

        System.out.println("Cadastro de Portador");
        System.out.println("Digite o Nome do Portador");
        nomePortador = in.nextLine().trim();

        System.out.println("Digite o CPF Portador");

        System.out.print("Inseririndo dados na Tabela: " + "Portador");

state = co;







    }

}





