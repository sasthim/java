package java1.lista2.exercicio2;

public class Aluno {
    private String Ra;
    private String Nome;
    private float AC1;
    private float AC2;
    private float AG;
    private float AF;

    public void setRa(String string) {
        this.Ra = string;
    }

    public String getRa() {
        return this.Ra;
    }

    public void setNome(String string) {
        this.Nome = string;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setAC1(float nota) {
        this.AC1 = nota;
    }

    public float getAC1() {
        return this.AC1;
    }

    public void setAC2(float nota) {
        this.AC2 = nota;
    }

    public float getAC2() {
        return this.AC2;
    }

    public void setAG(float nota) {
        this.AG = nota;
    }

    public float getAG() {
        return this.AG;
    }

    public void setAF(float nota) {
        this.AF = nota;
    }

    public float getAF() {
        return this.AF;
    }

    public double calcularMedia() {
        return (AC1*0.15)+(AC2*0.3)+(AG*0.1)+(AF*0.45);
    }

    public String verificarAprovacao() {
        if (calcularMedia() >= 5)
        return "Aprovado";
        else
        return "Reprovado";
    }

    public String imprimir() {
        return  "\n=============="+
                "\nRa: "+getRa()+
                "\nNome : "+getNome()+
                "\nAC1 : "+getAC1()+
                "\nAC2 : "+getAC2()+
                "\nAG : "+getAG()+
                "\nAF : "+getAF()+
                "\nMedia : "+calcularMedia()+
                "\nSituacao : "+verificarAprovacao()+
                "\n==============\n";
    }
}