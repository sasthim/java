package java1.lista4.ex1;

import java.util.ArrayList;

public class Curso {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private ArrayList<Aluno> lstAlunos; // optei por nao usar "alunos"

    public Curso() {
        this.lstAlunos = new ArrayList<>();
    }

    public Curso(int codigo, String nome, int cargaHoraria) {
        this();
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void inserirAluno(Aluno aluno) {
        lstAlunos.add(aluno);
    }

    public void removerAluno(int index) {
        lstAlunos.remove(index);
    } 

    public int getCodigo() {
        return this.codigo;
    }

    public int getQtdeAlunos() {
        return this.lstAlunos.size();
    }

    public int getAluno(String ra) { 
        for(int i = 0; i < lstAlunos.size(); i++)
            if(ra == lstAlunos.get(i).getRa())
                return i;
        return -1;
    }

    public String imprimir() {
        return  "\nCodigo: "+this.codigo+
                "\nNome: "+this.nome+
                "\nCarga horaria: "+this.cargaHoraria;
    }

    public String imprimirCompleto() {
        String str = "";
        for(int i = 0; i < lstAlunos.size(); i++)
            str += "\n\nAluno "+ (i+1) + lstAlunos.get(i).imprimir();
        return  imprimir()+str;
    }
}
