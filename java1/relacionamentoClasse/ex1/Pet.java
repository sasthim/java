package java1.relacionamentoClasse.ex1;

public class Pet {
    private String nome;
    private String raca;
    private int idade;

    public Pet (String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public String imprimir() {
        return  "\nNome: "+this.nome+
                "\nRaca: "+this.raca+
                "\nIdade: "+this.idade;
    }
}
