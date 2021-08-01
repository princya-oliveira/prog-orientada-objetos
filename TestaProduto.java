public class TestaProduto {
    
    public static void main(String args[]) {
        
        Produto produto1 = new Produto();
        produto1.id = 1010;
        produto1.descricao = "Antes de iniciar a prática do yoga é importante ter alguns equipamentos para trazer ainda mais conforto e o Tapete de Yoga da Life Zone é um deles.";
        produto1.qtde = 25;
        produto1.preco = 10;

        Produto produto2 = new Produto(1015, "A escada para circuito de agilidade propõe diversidade em exercícios de agilidade, para trabalho de propriocepção, fortalece os músculos inferiores e melhora a coordenação motora.", 15, 2);

        produto1.mostra();
        produto2.mostra(); 
    }
}
