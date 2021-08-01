public class Rio {
    
    // declarando as variáveis
    String nome;
    float nivel;
    boolean poluido;

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
        System.out.println("Nível atual do rio: " + this.nivel);
    }

    // método ensolarar(float): que diminui o nível atual do rio
    public void ensolarar(float x){
        this.nivel -= x;
        System.out.println("Nível atual do rio: " + this.nivel);
    }

    // método limpar(): que limpa o rio
    public void limpar(){
        this.poluido = false;
        System.out.println("Rio poluído? " + this.poluido);
    }
    // método sujar(): que polui o rio
    public void sujar(){
        this.poluido = true;
        System.out.println("Rio poluído? " + this.poluido);
    }
    // método mostra(): que mostra todas as informações do rio
    public void mostra(){
        System.out.println("Nome do rio: " + this.nome + "\nNível: " + this.nivel + "\nRio poluído? " + this.poluido);
    }
}
