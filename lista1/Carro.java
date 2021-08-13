package lista1;
public class Carro {
    
    // dois tipos de variáveis:
    // tipo primitivo(int, float, double, char)
    // tipo de classe(String, Float, Double, Integer)

    // propriedades (variáveis) da classe
    float velocidade;
    boolean motor; // true (ligado) - false (desligado)
    int ano; 
    String modelo; // String é uma classe pronta - conjunto de caracteres 

    // método construtor
    public Carro(){
        
    }

    // método construtor
    public Carro(String modelo, int ano, boolean motor, float velocidade){
        // a variável do objeto = variável do usuário
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
        this.velocidade = velocidade;
    }

    // um método ou operação
    public void mostra(){
        // qual palavra representa o objeto que se chama método
        System.out.println("Modelo: " + this.modelo + " Ano: " + this.ano + " Vel: " + this.velocidade);
    }
}
