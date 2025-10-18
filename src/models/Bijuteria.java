package models;

public class Bijuteria extends Loja {

    private Double metaVendas;

    public Bijuteria() {
    }

    public Bijuteria(String nome, Integer quantidadeFuncionarios, Double salarioBaseFuncionario, Endereco endereco, Data data, Double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data);
        this.metaVendas = metaVendas;
    }

    public Bijuteria(String nome, Integer quantidadeFuncionarios, Endereco endereco, Data data, Double metaVendas) {
        super(nome, quantidadeFuncionarios, endereco, data);
        this.metaVendas = metaVendas;
    }

    public Double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(Double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return "Bijuteria{" +
                "metaVendas=" + metaVendas +
                "} " + super.toString();
    }
}
