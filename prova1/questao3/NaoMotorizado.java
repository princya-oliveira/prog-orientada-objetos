package prova1.questao3;

public class NaoMotorizado extends Veiculo{
    private String meioLocomocao;
    public NaoMotorizado() {
        super();
    }
    public NaoMotorizado(int ano, float preco, String descricao, String meioLocomocao) {
        super(ano, preco, descricao);
        this.meioLocomocao = meioLocomocao;
    }
    public String getMeioLocomocao() {
        return meioLocomocao;
    }
    public void setMeioLocomocao(String meioLocomocao) {
        this.meioLocomocao = meioLocomocao;
    }
    @Override
    public String toString(){
        return super.toString() + " Meio de Locomoção: " + this.meioLocomocao;
    }

}