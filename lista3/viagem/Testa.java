package lista3.viagem;
import java.util.Date;

public class Testa {
    
    public static void main(String args[]) {

        Passageiro pas1 = new Passageiro("23.452.522-1", "156.125.456-03", "Pedro");

        Voo voo1 = new Voo(123, "Congonhas", "Galeão", new Date());

        Reserva re1 = new Reserva(3, new Date(), 3600, pas1, voo1);

        System.out.println(re1.toString());

    }
}

