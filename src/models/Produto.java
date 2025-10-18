package models;

public class Produto {

    private String nome;
    private Integer preco;

    private Data data;

    public Produto(String nome, Integer preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, Integer preco, Data data) {
        this.nome = nome;
        this.preco = preco;
        this.data = data;
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

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public boolean estaVencido(Data data) {
        if (data.getAno() != this.data.getAno()) {
            return data.getAno() < this.data.getAno();
        }
        if (data.getMes() != this.data.getMes()) {
            return data.getMes() < this.data.getMes();
        }
        return data.getDia() < this.data.getDia();
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", data=" + data +
                '}';
    }
}
