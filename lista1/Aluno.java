package lista1;
public class Aluno {

    String nome;
    int numeroAluno;
    int idade;
    float p1;
    float p2;
    float notaFinal;

    // método construtor
    public Aluno(String nome, int numeroAluno, int idade, float p1, float p2){
        this.nome = nome;
        this.numeroAluno = numeroAluno;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    // criando método notaFinal()
    public void notaFinal(){
        notaFinal = this.p1 + this.p2 / 2;
        System.out.println("Nota final: " + notaFinal);
    }

    // criando método dadosAluno()
    public void dadosAluno(){
        System.out.println("Nº do aluno: " + this.numeroAluno + "\nNome do aluno: " + this.nome + "\nIdade: " + this.idade);
    }

    // criando método passou()
    public void passou(){
        if(notaFinal >= 6){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
        
    }
    
}


