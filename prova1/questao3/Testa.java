package prova1.questao3;

public class Testa {

    public static void exemploPolimorfismo(Veiculo camaleao) {
        System.out.println(camaleao.toString());
    }

    public static void main(String args[]) {

        Motorizado mot1 = new Motorizado(2020, 30000, "Veículo motorizado", 152, "Diesel");
        exemploPolimorfismo(mot1);

        NaoMotorizado nmot1 = new NaoMotorizado(2021, 15000, "Veículo não motorizado", "Nao");
        exemploPolimorfismo(nmot1);
    }
}

// Resposta questão D) Como demonstrado acima, o polimorfismo nesta implementação se caracteriza
// pela criação da classe abstrata veiculo, que pode tanto servir para identificar VEICULOS motorizados 
// ou não motorizados.
