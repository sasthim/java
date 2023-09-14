package java1.lista2.exercicio1;

public class Pessoa {
    private String CPF;
    private String Nome;
    private char Sexo;
    private int Idade;

    public void setCPF(String cpf) {
        this.CPF = cpf;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setIdade(int idade) {
        this.Idade = idade;
    }

    public int getIdade() {
        return this.Idade;
    }

    public void setSexo(char sexo) {
        this.Sexo = sexo;
    }

    public char getSexo() {
        return this.Sexo;
    }

    public String imprimir() {
        return  "\n=============="+
                "\nCPF: "+getCPF()+
                "\nNome: "+getNome()+
                "\nIdade: "+getIdade()+
                "\nSexo: "+getSexo()+
                "\n==============\n";
    }
}