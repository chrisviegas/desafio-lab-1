public class Bijuteria extends Loja {

    private Integer metaVendas;

    public Bijuteria(Integer metaVendas) {
        this.metaVendas = metaVendas;
    }

    public Bijuteria(String nome, Integer quantidadeFuncionarios, Integer metaVendas) {
        super(nome, quantidadeFuncionarios);
        this.metaVendas = metaVendas;
    }

    public Bijuteria(String nome, Integer quantidadeFuncionarios, Integer salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Integer tamanhoEstoque, Integer metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.metaVendas = metaVendas;
    }

    public Bijuteria(String nome, Integer quantidadeFuncionarios, Integer salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Integer metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.metaVendas = metaVendas;
    }

    public Integer getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(Integer metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return "Bijuteria{" +
                "metaVendas=" + metaVendas +
                "} " + super.toString();
    }
}
