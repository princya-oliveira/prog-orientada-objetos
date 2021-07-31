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

    // método chover(float)
    public void chover(float x){
        this.nivel += x;
    }



}
