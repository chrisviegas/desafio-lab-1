public class Vestuario extends Loja {

    private boolean produtosImportados;


    public Vestuario(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, Integer quantidadeFuncionarios, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios);
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, Integer quantidadeFuncionarios, Integer salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Integer tamanhoEstoque, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, Integer quantidadeFuncionarios, Integer salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, Integer quantidadeFuncionarios, Integer salarioBaseFuncionario, Endereco endereco, Data data, boolean produtosImportados, int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario ,endereco, data, tamanhoEstoque);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString()
    {
        return "Vestuario{" +
                "produtosImportados=" + produtosImportados +
                "} " + super.toString();
    }
}
