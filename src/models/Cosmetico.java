package models;

public class Cosmetico extends Loja{

    private Double taxaComercializacao;

   public Cosmetico() {}

    public Cosmetico(String nome, Integer quantidadeFuncionarios, Double salarioBaseFuncionario, Endereco endereco, Data data, Double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data);
        this.taxaComercializacao = taxaComercializacao;
    }

    public Cosmetico(String nome, Integer quantidadeFuncionarios, Endereco endereco, Data data, Double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, endereco, data);
        this.taxaComercializacao = taxaComercializacao;
    }

    public Double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(Double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return "Cosmetico{" +
                "taxaComercializacao=" + taxaComercializacao +
                "} " + super.toString();
    }
}
