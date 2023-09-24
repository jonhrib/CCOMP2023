import java.util.Arrays;
import java.util.Scanner;

public class Bee3103 {
    
	public static void main (String args []) {
        Scanner s = new Scanner(System.in);
        int qtd = s.nextInt();

        for (int i = 0; i < qtd; i++) {
            String numero = s.next();
            char[] digitos = numero.toCharArray();
            
            Arrays.sort(digitos);
            
            int cont = 0;
            while (digitos[cont] == '0') {
                cont++;
            }
            
            char temp = digitos[0];
            digitos[0] = digitos[cont];
            digitos[cont] = temp;
            
            String numerodasorte = new String(digitos);
            
            System.out.println(numerodasorte);
        }
    }
}
