package lista4.rh;

public class Assistente extends Funcionario{

    private float horaExtra;

    public Assistente() {
        super(); // chama construtor da superclasse
    }

    // Assistente as1 = new Assistente("Fulano", "123", 200, 2);
    public Assistente(String nome, String rg, float salario, float horaExtra) {
        super(nome, rg, salario); // chama construtor da superclasse - reutilização de código
        this.setHoraExtra(horaExtra);
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    // apesar de herdarmos o toString(), teremos que reescrevê-lo
    @Override // indica que estamos anulando algo que foi herdado
    public String toString() {
        return " Hora extra: " + this.horaExtra + super.toString(); // super está chamando o método da super classe
    } 

    

    

    
    
    
}