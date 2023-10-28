package java1.tarefa.ex2;

import java.util.ArrayList;

public class Professor extends Funcionario{
    private String urlLattes;
    private ArrayList<Disciplina> disciplinas;

    public Professor() {
        super();
    }

    public Professor(String nome, String cpf, int numeroCracha, double salario, String urlLattes) {
        super(nome, cpf, numeroCracha, salario);
        this.urlLattes = urlLattes;
    }

    public void bonificacao(){

    }

    public void addDisciplina(Disciplina e){
        this.disciplinas.add(e);
    }

    public void removeDisciplina(Disciplina e){
        this.disciplinas.remove(e);
    }

    @Override
    public String toString() {
        String str = "";

        for(int i = 0; i < disciplinas.size(); i++) {
            str += i + "\n" + disciplinas.get(i).toString() + "\n";
        }
        return  super.toString() +
                "urlLattes: " + getUrlLattes() +
                "Disciplinas: \n" + str;
    }

    public String getUrlLattes() {
        return this.urlLattes;
    }

    public void setUrlLattes(String urlLattes) {
        this.urlLattes = urlLattes;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return this.disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
