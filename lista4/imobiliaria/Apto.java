package lista4.imobiliaria;

public class Apto extends Moradia {

    private int num;
    private int andar;

    public Apto() {
        super();
    }

    public Apto(String endereco, String cidade, float tamanho, int num, int andar) {
        super(endereco, cidade, tamanho); 
        this.setNum(num);
        this.setAndar(andar);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
    }

    @Override
    public String toString() {
        return super.toString() + " Número: " + this.num + " Andar: " + this.andar;
    }

    @Override
    public void calcularPreco() {
        
    }
    
}
    
