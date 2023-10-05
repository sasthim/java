package java1.lista3.ex1_JOption;

public class Apolice {
    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorAutomovel;

    public Apolice() {
    }

    public Apolice(int numero, String nome, int idade, int sexo, double valorAutomovel) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;

        if(sexo == 0)
        this.sexo = 'M';
        else
        this.sexo = 'F';

        this.valorAutomovel = valorAutomovel;
    }

    public double calcularValor() {
        if (sexo == 'M' && idade <= 25) {
            return this.valorAutomovel*0.1;
        }
        if (sexo == 'M' && idade > 25) {
            return this.valorAutomovel*0.05;
        }
        if (sexo == 'F') {
            return this.valorAutomovel*0.02;
        }
        return 0;
    }

    public String imprimir() {
        return "\nNumero: "+ getNumero()+
               "\nNome: "+ getNome()+
               "\nIdade: "+ getIdade()+
               "\nSexo: "+ getSexo()+
               "\nValor automovel: "+ getValorAutomovel()+
               "\nValor apolice: "+ calcularValor();
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getValorAutomovel() {
        return this.valorAutomovel;
    }

    public void setValorAutomovel(double numero) {
        this.valorAutomovel = numero;
    }
}
