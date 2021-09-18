package lista4.imobiliaria;

public class Apto extends Moradia {

    private int num, andar;

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
        this.num = num;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    @Override
    public String toString() {
        return super.toString() + " Número: " + this.num + " Andar: " + this.andar;
    }

    @Override
    public void calcularPreco() {
        float aux = (this.tamanho * 800);

        if (this.num % 2 == 0) {
            aux = aux + 200;
        }

        else {
            aux = aux + 300;
        }

        if (this.andar >= 3) {
            aux = aux + 2000;
        }

        System.out.println("Valor do apto. é de " + aux);
    }
    
}
    
