public class Cosmetico extends Loja{

    private Integer taxaComercializacao;

    public Cosmetico(Integer taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    public Cosmetico(String nome, Integer quantidadeFuncionarios, Integer taxaComercializacao) {
        super(nome, quantidadeFuncionarios);
        this.taxaComercializacao = taxaComercializacao;
    }

    public Cosmetico(String nome, Integer quantidadeFuncionarios, Integer salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Integer tamanhoEstoque, Integer taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }

    public Cosmetico(String nome, Integer quantidadeFuncionarios, Integer salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Integer taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.taxaComercializacao = taxaComercializacao;
    }

    public Integer getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(Integer taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return "Cosmetico{" +
                "taxaComercializacao=" + taxaComercializacao +
                "} " + super.toString();
    }
}
