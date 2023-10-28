package java1.tarefa.ex2;

public class Aluno extends Pessoa{
    private String ra;
    private Disciplina disciplina;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String cpf, String ra, Disciplina e) {
        super(nome, cpf);
        this.ra = ra;
        this.disciplina = e;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nRA: " + getRa()+
                "\nDisciplina: " + (getDisciplina()).getNome();
    }

    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Disciplina getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
