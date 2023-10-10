package java1.lista4.ex1;

public class Aluno {
    private String ra;
    private String nome;

    public Aluno(){

    }

    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public String getRa(){
        return this.ra;
    }

    public String imprimir() {
        return  "\nNome: "+this.nome+
                "\nRA: "+this.ra;
    }
}
