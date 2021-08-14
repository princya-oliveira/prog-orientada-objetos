package lista2;

public class TestaCliente{

    public static void main(String args[]) {
        
        Cliente cliente1 = new Cliente("123456-5", "1234-4", "José Ramalho", 5000);
        System.out.println(cliente1.mostra());
    }
}