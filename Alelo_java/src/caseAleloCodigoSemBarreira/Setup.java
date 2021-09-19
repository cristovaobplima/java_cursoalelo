package caseAleloCodigoSemBarreira;

import java.util.Scanner;

public class Setup {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            ConexaoBD.getConnection().Conn();


        }
    }

}

/*while (rs.next()) {
        System.out.println(rs.getString("Nome_Portador"));

        String sql = "select * from portador";
        ResultSet rs = statement.executeQuery(sql);

 */