package prova1.questao2;
import java.util.Date;

public class Testa {

    public static void main(String args[]) {
        Cliente cli1 = new Cliente("400951257", "Francisco de Oliveira");
        Cliente cli2 = new Cliente("40095152", "Marcos Faleiros");
        Cliente cli3 = new Cliente("400951285", "Ruth Dau");

        Unidade un1 = new Unidade("Franca", "São Paulo");
        Unidade un2 = new Unidade("Ribeirão Preto", "São Paulo");

        Pedido ped = new Pedido();
        ped.setCodigo(1);
        ped.setData(new Date());
        ped.addCliente(cli1);
        ped.addCliente(cli2);
        ped.addCliente(cli3);
        ped.addUnidade(un1);
        ped.addUnidade(un2);
        
        System.out.println(ped.toString());
    }
    
    // Resposta da D) 
    // Na agregação podemos criar unidade e clientes independentes de pedido, isso não 
    // ocorreria se estivessemos implementando uma composição, pois as parte apenas 
    // existiriam se houvesse o todo(no caso 'pedido').
}
