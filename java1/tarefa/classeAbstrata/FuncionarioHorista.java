package java1.tarefa.classeAbstrata;

public class FuncionarioHorista extends Funcionario {
    private int qtdeHoras;
    private double valorHora;

    public FuncionarioHorista() {
    }

    public FuncionarioHorista(int numeroCracha, String nome, String setor, String funcao, int qtdeHoras, double valorHora) {
        super(numeroCracha, nome, setor, funcao);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    public int getQtdeHoras() {
        return this.qtdeHoras;
    }

    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public double getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "Quantidade de horas: " + getQtdeHoras() + 
                "\nValor por hora: " + getValorHora() + "\n";
    }

    @Override
    public double calcularSalario() {
        return qtdeHoras * valorHora;
    }

}
