package models;

public class Informatica extends Loja {

    private Double seguroEletronicos;

    public Informatica() {
    }

    public Informatica(String nome, Integer quantidadeFuncionarios, Double salarioBaseFuncionario, Endereco endereco, Data data, Double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, Integer quantidadeFuncionarios, Endereco endereco, Data data, Double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, endereco, data);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(Double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return "Informatica{" +
                "seguroEletronicos=" + seguroEletronicos +
                "} " + super.toString();
    }
}
