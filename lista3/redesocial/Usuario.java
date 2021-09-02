package lista3.redesocial;

public class Usuario {
    private String login;
    private String senha;

    public Usuario() {
    }

    public Usuario(String login, String senha) {
        this.setLogin(login);
        this.setSenha(senha);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String toString() {
        return "Login: " + this.login + " Senha: " + this.senha;
    }
}
