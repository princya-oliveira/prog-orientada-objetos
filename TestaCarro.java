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

        Carro obj2 = new Carro();
        obj2.modelo = "Celta";
        obj2.ano = 2016;
        obj2.motor = true;
        obj2.velocidade = 50;

        System.out.println("Obj1: Modelo: " + obj1.modelo + " Ano: " + obj1.ano + " Vel: " + obj1.velocidade);
        System.out.println("Obj2: Modelo: " + obj2.modelo + " Ano: " + obj2.ano + " Vel: " + obj2.velocidade);
    }
}
