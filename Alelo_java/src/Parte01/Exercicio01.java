package Parte01;

public class Exercicio01 {

    public static void main(String[] args) {
        int y = 99;
        int z = 11;
        int transfira = 0;

        transfira = y;
        y = z;
        z = transfira;

        System.out.println(y);
        System.out.println(z);
        System.out.println(transfira);

    }
}
