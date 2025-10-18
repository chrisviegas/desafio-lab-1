package models;

public class Vestuario extends Loja {

    private boolean produtosImportados;

    public Vestuario() {}

    public Vestuario(String nome, Integer quantidadeFuncionarios, Double salarioBaseFuncionario, Endereco endereco, Data data, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data);
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, Integer quantidadeFuncionarios, Endereco endereco, Data data, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, endereco, data);
        this.produtosImportados = produtosImportados;
    }

    public boolean isProdutosImportados() {
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
