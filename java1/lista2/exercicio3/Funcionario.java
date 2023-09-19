package java1.lista2.exercicio3; 

public class Funcionario {
    private int Cracha;
    private String Nome;
    private char TipoVinculo;
    private float ValorHora;
    private float QtdeHora;
    private float Salario;
    private float ValorDesconto;

    public void setCracha(String string) {
        this.Cracha = string;
    }

    public int getCracha() {
        return this.Cracha;
    }

    public void setNome(String string) {
        this.Nome = string;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setTipoVinculo(char vinculo) {
        this.TipoVinculo = vinculo;
    }

    public void getTipoVinculo() {
        return this.TipoVinculo;
    }

    public void setValorHora(float valor) {
        this.ValorHora = valor;
    }

    public float getValorHora() {
        return this.ValorHora;
    }

    public void setQtdeHora (float hora) {
        this.QtdeHora = hora;
    }

    public void getQtdeHora() {
        return this.QtdeHora;
    }

    public void setSalario(float salario) {
        this.Salario = salario;
    }

    public float getSalario() {
        return this.Salario;
    }

    public void setValorDesconto(float valor) {
        this.ValorDesconto = valor;
    }

    public float getValorDesconto() {
        return ValorDesconto;
    }

    public float CalcularSalario() {
        return ValorHora * QtdeHora;
    }

    public CalcularValorReceber() {
        return Salario - ValorDesconto;
    }

    public String imprimir() {
        return "\n###############"+
               "\nCracha: "+ getCracha()+
               "\nNome: "+ getNome()+
               "\nTipo vinculo: "+ getTipoVinculo()+
               "\nSalario: "+ CalcularSalario();
               "\nDesconto: "+ getValorDesconto()+
               "\nValor a receber: "+ CalcularValorReceber();
    }
}
