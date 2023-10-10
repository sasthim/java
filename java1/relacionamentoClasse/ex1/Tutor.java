package java1.relacionamentoClasse.ex1;

import java.util.ArrayList;

public class Tutor {
    private String nome;
    private String cpf;
    ArrayList<Pet> lstPets ;

    public Tutor() {
        this.lstPets = new ArrayList<>();
    }

    public Tutor(String nome, String cpf) {
        this();
        this.nome = nome;
        this.cpf = cpf;
    }

    public ArrayList<Pet> getLstPets() {
        return lstPets;
    }

    public void addPet(Pet pet) {
        lstPets.add(pet);
    }

    public void removePet(Pet pet) {
        lstPets.remove(pet);
    }

    public void removePet(int pet) {
        lstPets.remove(pet); // pet = index(indice) nesse caso
    }

    public String imprimirPets() {
        String str = "";
        for(int i = 0; i < lstPets.size(); i++)
            str += "\n\nPet "+(i+1)+lstPets.get(i).imprimir();
        return str;
    }

    public String imprimir() {
        return  "\nNome: "+nome+
                "\nCPF: "+cpf+
                imprimirPets();
    }
}
