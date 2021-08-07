public class TestaRio {
    
    public static void main(String args[]){

        Rio rio1 = new Rio("Amazonas", 1.3f, false);
        rio1.chover(0.4f);
        rio1.sujar();

        Rio rio2 = new Rio("Tamoios", 0.9f, true);
        rio2.ensolarar(0.3f);
        rio2.limpar();

        System.out.println(rio1.mostra());
        System.out.println(rio2.mostra());
    }
}
