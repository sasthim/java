package java1.tarefa.classeAbstrata;

public class FuncionarioMensalista extends Funcionario {
    private double salario;
    private double desconto;

    public FuncionarioMensalista() {
    }

    public FuncionarioMensalista(int numeroCracha, String nome, String setor, String funcao, double salario, double desconto) {
        super(numeroCracha, nome, setor, funcao);
        this.salario = salario;
        this.desconto = desconto;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getDesconto() {
        return this.desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "Salario: " + getSalario() + 
                "\nDesconto: " + getDesconto() + "\n";
    }

    @Override
    public double calcularSalario() {
        return salario - desconto;
    }

}
