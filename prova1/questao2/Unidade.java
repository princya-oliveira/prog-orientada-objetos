package prova1.questao2;

public class Unidade {
    private String cidade, estado;

    public Unidade() {
    }

    public Unidade(String cidade, String estado) {
        this.setCidade(cidade);
        this.setEstado(estado);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String toString() {
        return "Cidade: " + this.cidade + " Estado: " + this.estado;
    }
}
