package java1.tarefa.ex1;

public class Gato extends Animal {
    private int alturaSalto;

    public Gato() {
        super();
        this.alturaSalto = 0;
    }

    public Gato(String nome, int idade, int alturaSalto) {
        super(nome, idade);
        this.alturaSalto = alturaSalto;
    }

    public int getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(int alturaSalto) {
        this.alturaSalto = alturaSalto;
    }

    @Override
    public String imprimir() {
        return super.imprimir() + ", Altura de Salto: " + alturaSalto;
    }

    @Override
    public String falar() {
        return "Gato mia";
    }
}