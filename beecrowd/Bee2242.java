import java.util.Scanner;

public class Bee2242 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		String frase = s.next();
        String minusculas[] = frase.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "").split("");
        String contrario [] = new String [minusculas.length];
        int i = 0;
        for (int j = minusculas.length-1; j>=0; j--) {
            contrario [i] = (minusculas[j]);
            i++;
        }
        int cont = 0;
        for (int j = 0; j < contrario.length; j++) {
        	if (contrario[j].equals(minusculas[j])) {
        		cont++;
        	}
        }
        if (cont == minusculas.length) System.out.println("S");
        else System.out.println("N");
	}
}
