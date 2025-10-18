package models;

public class Produto {

    private String nome;
    private Double preco;

    private Data data;

    public Produto(String nome, Double preco, Data data) {
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
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
                '}';
    }


}
