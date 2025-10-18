public class Informatica extends Loja {

    private Integer seguroEletronicos;

    public Informatica(Integer seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, Integer quantidadeFuncionarios, Integer seguroEletronicos) {
        super(nome, quantidadeFuncionarios);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, Integer quantidadeFuncionarios, Integer salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Integer tamanhoEstoque, Integer seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, Integer quantidadeFuncionarios, Integer salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Integer seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Integer getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(Integer seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return "Informatica{" +
                "seguroEletronicos=" + seguroEletronicos +
                "} " + super.toString();
    }
}
