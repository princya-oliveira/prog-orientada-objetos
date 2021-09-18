package lista4.imobiliaria;

public class Casa extends Moradia {

    private float tamQuintal;
    private boolean piscina;

    public Casa() {
        super();
    }

    public Casa(String endereco, String cidade, float tamanho, float tamQuintal, boolean piscina) {
        super(endereco, cidade, tamanho); 
        this.setTamQuintal(tamQuintal);
        this.setPiscina(piscina);
    }

    public float getTamQuintal() {
        return tamQuintal;
    }

    public void setTamQuintal(float tamQuintal) {
    }

    public boolean getPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
    }

    @Override
    public String toString() {
        return super.toString() + " Quintal: " + this.tamQuintal + " tem piscina: " + this.piscina;
    }

    @Override
    public void calcularPreco() {
        float aux;
        aux = (this.tamanho * 500) + (this.tamQuintal * 100);
        
        if (this.piscina) {
            aux = aux + 1000;
        }

        System.out.println("Valor da casa é de " + aux);
    }
    
}
