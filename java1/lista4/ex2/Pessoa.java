package java1.lista4.ex2;

import java.util.ArrayList;

public class Pessoa {
    private int codigo;
    private String nome;
    ArrayList<Automovel> lstAutomoveis;

    public Pessoa() {
        this.lstAutomoveis = new ArrayList<>();
    }

    public Pessoa(int codigo, String nome) {
        this();
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void inserirAutomovel(Automovel automovel) {
        this.lstAutomoveis.add(automovel);
    }

    public void removerAutomovel(int index) {
        this.lstAutomoveis.remove(index);
    }

    public Automovel getAutomovel(int index) {
        return this.lstAutomoveis.get(index);
    }

    public String imprimir() {
        return  "\nCodigo: "+this.codigo+
                "\nNome: "+this.nome;
    }

    public String imprimirCompleto() {
        String str = "";
        for(int i = 0; i < lstAutomoveis.size(); i++)
            str += "\n\nAutomovel "+ (i+1) + lstAutomoveis.get(i).imprimir();
        return  imprimir()+str;
    }
}
