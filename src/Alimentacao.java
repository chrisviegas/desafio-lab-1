public class Alimentacao extends Loja  {

    private Data dataAlvara;


    public Alimentacao(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(String nome, Integer quantidadeFuncionarios, Data dataAlvara) {
        super(nome, quantidadeFuncionarios);
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(String nome, Integer quantidadeFuncionarios, Integer salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Integer tamanhoEstoque, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(String nome, Integer quantidadeFuncionarios, Integer salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario,
                       Endereco endereco, Data data, Data dataAlvara, int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario ,endereco, data, tamanhoEstoque);
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
