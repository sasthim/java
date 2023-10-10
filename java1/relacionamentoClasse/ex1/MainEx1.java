package java1.relacionamentoClasse.ex1;

import javax.swing.JOptionPane;

public class MainEx1 {
    public static void main(String[] args) {
        Tutor tut = new Tutor("Edu", "2312323");

        Pet pet1 = new Pet("Tupac", "Vira-lata", 6);
        Pet pet2 = new Pet("Rock", "American bully", 2);

        tut.addPet(pet1);
        tut.addPet(pet2);

        JOptionPane.showMessageDialog(null, tut.imprimir());
    }
}
