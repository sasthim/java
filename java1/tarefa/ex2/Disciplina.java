package java1.tarefa.ex2;

import java.util.ArrayList;

public class Disciplina {
    private int codigo;
    private String nome;
    private ArrayList<Aluno> alunos;


    public Disciplina() {
        alunos = new ArrayList<>();
    }

    public Disciplina(int codigo, String nome) {
        this();
        this.codigo = codigo;
        this.nome = nome;
    }

    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void removeAluno(Aluno aluno){
        alunos.remove(aluno);
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nCodigo: " + getCodigo()+
                "\nNome: " + getNome()+
                "\nAlunos: " + getAlunos();
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

}
