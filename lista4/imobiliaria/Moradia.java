package lista4.imobiliaria;

public abstract class Moradia {

    protected String endereco;
    protected String cidade;
    protected float tamanho;

    public Moradia() {
        
    }

    public Moradia(String endereco, String cidade, float tamanho) {
        this.endereco = endereco;
        this.cidade = cidade;
        this.tamanho = tamanho;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public float getTamanho() {
        return tamanho;
    }
    
    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String toString(){
        return "Endereço: " + this.endereco + " Cidade: " + this.cidade + " Tamanho " + this.tamanho;
    }
    
    public abstract void calcularPreco();
    
}
