public class TestaCliente {
    
    public static void main(String args[]){

        Cliente cliente1 = new Cliente(1, 2122, "Fulano", 2550, 550, 0);
        Cliente cliente2 = new Cliente(2, 2122, "Beltrano", 3000, 0, 700);

        cliente1.realizarDeposito();
        cliente1.realizarSaque();
        cliente1.mostraDados();

        cliente2.realizarDeposito();
        cliente2.realizarSaque();
        cliente2.mostraDados();
    }
}
