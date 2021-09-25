package prova1.questao3;

public class Veiculo {

    protected int ano;
    protected float preco;
    protected String descricao;

    public Veiculo() {
    }

    public Veiculo(int ano, float preco, String descricao) {
        this.ano = ano;
        this.preco = preco;
        this.descricao = descricao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getPreco() {
        return preco;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString(){
        return "Ano: " + this.ano + " Preço: " + this.preco + " Descrição: " + this.descricao;
    }
}
