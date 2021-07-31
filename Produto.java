public class Produto {

    // declarando as variáveis
    int id;
    String descricao;
    int qtde;
    float preco;

    public Produto(int id, String descricao, int qtde, float preco){
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    public Produto(){

    }

    public void comprar(int x) {
        this.qtde += x;
    }

    public void vender(int x) {
        this.qtde -= x;
    }

    public void subir(float x) {
        this.preco += x;
    }

    public void descer(float x) {
        this.preco -= x;
    }

    public void mostra(){
        System.out.println("-Informações do produto-" + "\nID do produto: " + this.id + "\nDescrição do produto: " + this.descricao + "\nQuantidade: " + this.qtde + "\nPreço: " + this.preco);
    }
    
}
