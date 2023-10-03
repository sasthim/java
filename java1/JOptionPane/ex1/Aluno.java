package java1.JOptionPane.ex1;

public class Aluno {
    private String ra;
    private String nome;

    public Aluno (String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public String imprimir() {
        return "\nRA: "+ra+
               "\nNome: "+nome;
    }
}
