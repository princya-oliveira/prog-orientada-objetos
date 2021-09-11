package lista4.rh;

public class Gerente extends Funcionario{

    private float bonus;
    private String meta;

    public Gerente() {
        super(); // chama construtor da superclasse
    }

    public Gerente(String nome, String rg, float salario, float bonus, String meta) {
        super(nome, rg, salario); 
        this.setBonus(bonus);
        this.setMeta(meta);
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    @Override 
    public String toString() {
        return " Bonus: " + this.bonus + " Meta: " + this.meta + super.toString();
    } 

    

    

    

    
    
    
}
