package Parte01;

public class exercicio_for1 {

    public static void main(String[] args) {

        int numero = 200;
        String texto = "cristovao";
        char result = texto.charAt(0);


        for (int n = 0; n <=6; n++){
        if (n % 2 == 0){
            System.out.println("Numeros Par: " + n);
        }
            else {
            System.out.println("Numeros Impar: " + n);
        }

        }
        System.out.println(result);



    }
}
