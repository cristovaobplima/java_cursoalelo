package projetoempresadecartaodebeneficios;


import java.time.LocalDate;

public interface InterfaceCartaoDeBeneficio {

    void adicionarTransacao();

    void mostrarSaldo(Double saldoAtual1) ;

    void criaDataDeCadastro();

    void criaDataDeValidade();

}
