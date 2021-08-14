package lista2;

public class Cliente {
    
    // declarando as variáveis
    private String numeroConta, numeroAgencia, nome;
    private float saldo;
    
    public Cliente(){

    }

    // método getters
    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo){
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    // método setters
    public final void setNumeroConta(String numeroConta){
        if((numeroConta.length() == 8) && (numeroConta.charAt(6) == '-')){
            this.numeroConta = numeroConta;
        }
        else{
            System.out.println("O número da conta deve conter 8 dígitos");
        }
    }

    public final void setNumeroAgencia(String numeroAgencia){
        if((numeroAgencia.length() == 6) && (numeroAgencia.charAt(4) == '-')){
            this.numeroAgencia = numeroAgencia;
        }
        else{
            System.out.println("O número da agência deve conter 6 dígitos.");
        }
    }

    public final void setNome(String nome){
        if(nome.length() <= 30){
            this.nome = nome;
        }
        else{
            System.out.println("O nome não pode ultrapassar 30 caracteres.");
        }
    }

    public final void setSaldo(float saldo){
        this.saldo += saldo;
    }

    public String mostra(){
        return String.format("Número da conta: %s Número da agência: %s Nome: %s Saldo: %.2f", this.numeroConta, this.numeroAgencia, this.nome, this.saldo);
    }
}
