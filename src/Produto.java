public class Produto {

    private String nome;
    private Integer preco;

    private Data dataValidade;

    public Produto(String nome, Integer preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, Integer preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data data) {
        if (data.getAno() != this.dataValidade.getAno()) {
            return data.getAno() < this.dataValidade.getAno();
        }
        if (data.getMes() != this.dataValidade.getMes()) {
            return data.getMes() < this.dataValidade.getMes();
        }
        return data.getDia() < this.dataValidade.getDia();
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", data=" + dataValidade +
                '}';
    }
}
