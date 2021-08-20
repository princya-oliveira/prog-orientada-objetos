package lista2.produto;
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

        // ENCAPSULAMENTO - Private
        // outro desenvolvedor não pode modifcar a qtde do produto conforme queira
        // por isso, a partir de agora sempre que criarmos uma variável, vamos 
        // encapsula-la, para que outros não possam utilizá-las indevidamente.
        Produto produto3 = new Produto();
        produto3.setQtde(10);
        produto3.setPreco(15);
        produto3.setId(1);
        produto3.setDescricao("Sabonete");

        Produto produto4 = new Produto();
        produto4.setQtde(-3);
        produto4.setPreco(-13);
        produto4.setId(-3);
        produto4.setDescricao("Chuveiro");

        Produto produto5 = new Produto(100, "Xícara", 5, 8);
        produto5.vender(7);
        produto5.descer(10);
        System.out.println(produto5.mostra());
    }
}
