public class TestaRio {
    
    public static void main(String args[]){

        // criando rio1
        Rio rio1 = new Rio();
        rio1.nome = "Rio Negro";
        rio1.nivel = 28;
        rio1.poluido = false;
        

        Rio rio2 = new Rio("Rio Coari", 19, false);
        
        rio1.mostra();
        rio2.mostra();
    }
}
