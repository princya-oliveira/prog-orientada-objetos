package lista1;
public class TestaCliente {
    
    public static void main(String args[]){

        Cliente cliente1 = new Cliente(1, 2122, "Fulano", 2550);
        cliente1.depositar(1000);
        cliente1.sacar(500);

        System.out.println(cliente1.dadosCliente());

        Cliente cliente2 = new Cliente(2, 2122, "Beltrano", 3000);
        cliente2.depositar(1000);
        cliente2.sacar(1500);

        System.out.println(cliente2.dadosCliente());
    }
}
