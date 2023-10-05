package java1.lista3.exercicio2;

public class Vendedor {
    private int codigo;
    private String nome;
    private double percentualComissao;

    public Vendedor() {
    }

    public Vendedor(int codigo, String nome, double percentualComissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPercentualComissao() {
        return this.percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double calcularPagamentoComissao(double valorVenda) {
        return valorVenda * this.percentualComissao / 100;
    }

    public double calcularPagamentoComissao(double valorVenda, double desconto) {
        return calcularPagamentoComissao(valorVenda) - desconto;
    }

    public String imprimir() {
        return "Código: " + this.codigo + "\nNome: " + this.nome + "\n% Comissão: " + this.percentualComissao;
    }

    public String imprimir(double valorVenda, double desconto) {
        return "Código: " + this.codigo + "\nNome: " + this.nome + "\nValor Venda: " + valorVenda + "\n% Comissão: " +
                this.percentualComissao + "\nDesconto: " + desconto + "\nValor a Pagar: " + calcularPagamentoComissao(valorVenda, desconto);
    }

    public String imprimir(double valorVenda) {
        return "Código: " + this.codigo+
               "\nNome: " + this.nome +
               "\nValor Venda: " + valorVenda +
               "\n% Comissão: " + this.percentualComissao +
               "\nValor a Pagar: " + calcularPagamentoComissao(valorVenda);
    }
}
