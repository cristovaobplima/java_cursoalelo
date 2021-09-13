package projetoempresadecartaodebeneficios;

public interface InterfaceCartaoDeBeneficio {

    void adicionarTransacao(Double valor, Integer identificadorEstabelecimento, String tipoDeEstabelecimento);

    void mostrarSaldo();

    void criaDataDeCadastro();

    void criaDataDeValidade();

}
