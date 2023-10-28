package java1.tarefa.ex1;

public class Capivara extends Animal {
    private int peso;

    public Capivara() {
        super();
        this.peso = 0;
    }

    public Capivara(String nome, int idade, int peso) {
        super(nome, idade);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String imprimir() {
        return super.imprimir() + ", Peso: " + peso;
    }

    @Override
    public String falar() {
        return "Capivara faz som";
    }
}
