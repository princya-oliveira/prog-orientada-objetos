package prova1.questao1;

public class Computador {

    // declarando as variáveis encapsuladas
    private boolean modo;
    private int memoria;

    // construtor vazio
    public Computador() {

    }

    // construtor
    public Computador(boolean modo, int memoria) {
        this.modo = modo;
        this.memoria = memoria;
    }
    
    // setters e getters
    public final void setModo(boolean modo){
        this.modo = modo;
    }

    public boolean getModo() {
        return this.modo;
    }

    public final void setMemoria(int memoria){
        if(memoria == 4) {
            this.memoria = memoria;
        }

        else {
            System.out.println("Capacidade de memória inválida. Tente: 4, 8, 16 ou 32GB");
        }

    }

    public int getMemoria() {
        return this.memoria;
    }

    public String toString() { 
        return "Modo: " + this.modo + " Memória RAM: " + this.memoria;
    }

    // método upgrade de memória
    public void upGrade(int x){
        if (x == 4)
            this.memoria += x;
    }
}

