package lista3.redesocial;

public class Testa {

    public static void main(String args[]) {
        Usuario usr1 = new Usuario("Fulano@email.com", "123");

        Usuario usr2 = new Usuario("Beltrano@email.com", "236");

        Usuario usr3 = new Usuario("Ciclano@email.com", "852");

        RedeSocial rs = new RedeSocial();
        rs.setCodigo(1);
        rs.setNome("Instagram");
        rs.setUrl("www.instagram.com");
        rs.addUsuario(usr1); // adiciona usuário na rede social
        rs.addUsuario(usr2); // adiciona usuário na rede social
        rs.addUsuario(usr3); // adiciona usuário na rede social

        System.out.println(rs.toString());
    }
    
}
