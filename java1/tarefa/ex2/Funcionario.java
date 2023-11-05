package java1.tarefa.ex2;

public class Funcionario extends Pessoa {
    private int numeroCracha;
    private double salario;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, String cpf, int cracha, double salario) {
        super(nome, cpf);
        this.numeroCracha = cracha;
        this.salario = salario;
    }

    public void bonificacao(){
        setSalario(salario * 1.1);
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nCracha:" + getCracha() +
                "\nSalario: " + getSalario();
    }

    public int getCracha() {
        return this.numeroCracha;
    }

    public void setCracha(int cracha) {
        this.numeroCracha = cracha;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
