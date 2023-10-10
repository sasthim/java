package java_misc.register_cryptohack;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class roman_cipher {
    public static void main(String[] args) {

        String strOriginal = JOptionPane.showInputDialog("Paste roman cipher string:");
        String tmpStr = "";

        int c;

        ArrayList<String> strNew = new ArrayList<>();
        ArrayList<Integer> jE = new ArrayList<>();

        for (int j = 1; j <= 26; j++) {
            jE.add(j + 64);

            for (int i = 0; i < strOriginal.length(); i++) {

                c = (int) strOriginal.toUpperCase().charAt(i);

                if ((char) c == ' ');

                else if (jE.contains(c))
                    c += 26-j;
                    
                else
                    c -= j;

                tmpStr += (char) c;
            } 
            
            strNew.add(tmpStr);
            tmpStr = "";
        }

        for(int j = 0; j <= 25; j++)
            tmpStr += (j+1) + " | " + strNew.get(j).toString().toUpperCase() + "\n";
        JOptionPane.showMessageDialog(null, tmpStr, null, JOptionPane.PLAIN_MESSAGE);
    }
}
