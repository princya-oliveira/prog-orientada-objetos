package lista1;
public class Rio {
    
    // declarando as variáveis
    public String nome;
    public float nivel;
    public boolean poluido;

    // método construtor sem parâmetros
    public Rio(){

    }

    // método contrutor com parâmetros
    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    // método chover(float): que aumenta o nível atual do rio
    public void chover(float x){
        this.nivel += x;
    }

    // método ensolarar(float): que diminui o nível atual do rio
    public void ensolarar(float x){
        this.nivel -= x;
    }

    // método limpar(): que limpa o rio
    public void limpar(){
        this.poluido = false;
    }

    // método sujar(): que polui o rio
    public void sujar(){
        this.poluido = true;
    }

    // método mostra(): que mostra todas as informações do rio
    public String mostra(){
        String auxiliar = this.poluido? "está poluído" : "está limpo";
        return "Nome: " + this.nome + " Nível: " + this.nivel + " " + auxiliar;
    }
}
