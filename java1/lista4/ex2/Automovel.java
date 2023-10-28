package java1.lista4.ex2;

public class Automovel {
    private String marca;
    private String modelo;

    public Automovel(){
    }

    public Automovel(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca(){
        return this.marca;
    }

    public String imprimir() {
        return  "\nNodelo: "+this.modelo+
                "\nMarca: "+this.marca;
    }
}
