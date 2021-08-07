public class TestaProduto {
    
    public static void main(String args[]) {
        
        Produto produto1 = new Produto(1, "Máscara", 100, 3);
        produto1.comprar(10);
        produto1.subir(0.05f);

        Produto produto2 = new Produto(1, "Álcool Gel", 50, 15);
        produto2.comprar(5);
        produto2.subir(5);

        System.out.println(produto1.mostra());
        System.out.println(produto2.mostra());
    }
}
