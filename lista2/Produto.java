package lista2;
public class Produto {

    // vamos encapsular as variáveis para proteger, priva do mau uso
    private int id, qtde;
    private String descricao;
    private float preco;

    public Produto(){

    }

    public Produto(int id, String descricao, int qtde, float preco){
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    // criando os métodos setters
    public void setQtde(int qtde){
        if(qtde >= 0){
            this.qtde = qtde;
        }
        else{
            System.out.println("A quantidade do produto não pode ser negativo.");
        }
    }

    // criando os métodos setters
    public void setPreco(float preco){
        if(preco >= 0){
            this.preco = preco;
        }
        else{
            System.out.println("O preço do produto não pode ser negativo.");
        }
    }

    // criando os métodos setters
    public void setId(int id){
        if(id >= 0){
            this.id = id;
        }
        else{
            System.out.println("O id não pode ser um número negativo.");
        }
    }

    // criando os métodos setters
    public void setDescricao(String descricao){
        if(!descricao.isEmpty()){ // se descrição não for vazia
            this.descricao = descricao;
        }
        else{
            System.out.println("A descrição do produto não pode estar vazia.");
        }
    }

    public void comprar(int x) {
        this.qtde += x;
    }

    public void vender(int x) {
        this.setQtde(this.qtde - x);
    }

    public void subir(float x) {
        this.preco += x;
    }

    public void descer(float x) {
        this.setPreco(this.preco - x);
    }

    public String mostra(){
        return String.format("Id: %d Nome: %s Qtde: %d Preço: %.2f", this.id, this.descricao, this.qtde, this.preco);
    }
}
