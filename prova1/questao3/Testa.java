package prova1.questao3;

public class Testa {

    public static void exemploPolimorfismo(Veiculo camaleao){

        System.out.println(camaleao.toString());


    }   
    
    public static void main(String args[]){

        Motorizado  mt = new Motorizado(2019, 40000, "Carro popular", 1.3f, "Flex");
        NaoMotorizado nmt = new NaoMotorizado(2020, 400, "Patinete", "Pernas e pés");

        exemploPolimorfismo(mt);

        exemploPolimorfismo(nmt);

    }
}

// Resposta questão D) Como demonstrado acima, o polimorfismo nesta implementação se caracteriza
// pela criação da classe abstrata veiculo, que pode tanto servir para identificar VEICULOS motorizados 
// ou não motorizados.
