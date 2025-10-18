package models;

public class Alimentacao extends Loja  {

    private Data dataAlvara;

    public Alimentacao() {
    }

    public Alimentacao(String nome, Integer quantidadeFuncionarios, Double salarioBaseFuncionario, Endereco endereco, Data data, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data);
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(String nome, Integer quantidadeFuncionarios, Endereco endereco, Data data, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, endereco, data);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return "Alimentacao{" +
                "dataAlvara=" + dataAlvara +
                "} " + super.toString();
    }
}
