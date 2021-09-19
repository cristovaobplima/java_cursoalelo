package caseAleloCodigoSemBarreira;

//Importa as classes SQL
import java.sql.*;


public class ConexaoBD {
//Variaveis para autenticar no Banco
    private String url = "jdbc:mysql://localhost:3306/casealelocodsembar";
    private String username = "root";
    private String password = "";

    //Metodo para verificar se há uma instancia do banco
    public static ConexaoBD getConnection() {
        ConexaoBD instanciaBD = null;
        if (instanciaBD == null) {
            instanciaBD = new ConexaoBD();
            return instanciaBD;
        } else {
            return null;
        }

        }
        //Metodo para conexao ao Banco.
        public void Conn (){
        //try trata erros de execeção caso haja falha na conexao sera exibida a mensagem de erro
        try {
            DriverManager.getConnection(url, username, password);
            System.out.println("Conectado ao Banco com sucesso, Amem!");
        } catch (SQLException e) {
            System.out.println("ERRO AO CONECTAR AO BANCO, SOCORRO!");

        }



    }

    }













