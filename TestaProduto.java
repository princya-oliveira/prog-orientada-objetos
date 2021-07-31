public class TestaProduto {
    
    public static void main(String args[]) {
        
        Produto produto1 = new Produto();
        produto1.id = 1010;
        produto1.descricao = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        produto1.qtde = 25;
        produto1.preco = 10;

        Produto produto2 = new Produto(1015, "yyyyyyyyyyyyy", 15, 2);

        produto1.mostra();
        produto2.mostra(); 
    }
}
