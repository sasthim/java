package java1.tarefa.ex2;

public class Atendente extends Funcionario {
    private String setor;
    private String funcao;

    public Atendente() {
        super();
    }

    public Atendente(String nome, String cpf, int numeroCracha, double salario, String setor, String funcao) {
        super(nome, cpf, numeroCracha, salario);
        this.setor = setor;
        this.funcao = funcao;
    }

    @Override
    public void bonificacao() {
        setSalario(getSalario() * 1.15);
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nSetor: " + getSetor()+
                "\nFuncao: " + getFuncao();
    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return this.funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
