public class Cliente {

    int numeroConta;
    int numeroAgencia;
    String nome;
    float saldo;
    float deposito;
    float saque;

   public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo, float saque, float deposito){
       this.numeroConta = numeroConta;
       this.numeroAgencia = numeroAgencia;
       this.nome = nome;
       this.saldo = saldo;
       this.saque = saque;
       this.deposito = deposito;
   }
 
   public void realizarDeposito() {
       if(this.deposito > 0){
            System.out.println("- Extrato conta -" + "\nSaldo inicial: " + this.saldo + "\nValor do depósito: " + this.deposito);
            this.saldo += this.deposito;
            System.out.println("Saldo final: " + this.saldo);
        }
   }

   public void realizarSaque() {
       if(this.saque > 0){   
            System.out.println("- Extrato conta -" + "\nSaldo inicial: " + this.saldo + "\nValor do saque: " + this.saque);
            this.saldo -= this.saque;
            System.out.println("Saldo final: " + this.saldo);
        }
   }

   public void mostraDados() {
       System.out.println("- Dados do cliente -" + "\nNúmero da conta: " + this.numeroConta + "\nNome do cliente: " + this.nome + "\nSaldo atual: " + this.saldo); 
   }
    
}
