package lista1;
public class TestaCarro {
    
    // vamos criar os objetos
    // vamos criar o método main
    public static void main(String args[]){

        // vamos dar um Hello World
        System.out.println("Hello World - Good Night");

        // vamos criar um carro
        Carro obj1 = new Carro();
        obj1.modelo = "Onix";
        obj1.ano = 2019;
        obj1.motor = true;
        obj1.velocidade = 30;

        Carro obj2 = new Carro("Celta", 2016, true, 50);
        
        obj1.mostra();
        obj2.mostra();
    }
}
