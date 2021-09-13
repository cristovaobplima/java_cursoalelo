package Parte02;

class Pessoa {

String nome;
Integer anoDeNascimento;
float altura;

    void imprimirDadosPessoa(){

        System.out.println("Dados da Pessoa: " + "Nome: " + nome + "," + "Data de Nascimento: " + anoDeNascimento + "," + "Altura: " + altura);



    }

    void calcularAlturaPessoa() {

        var ano = 2021;
        System.out.println(anoDeNascimento - ano);
         

    }
}


