import java.util.Scanner;

public class Bee3358 {
	
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            String sobrenome = s.next();

            if (verifica(sobrenome)) {
                System.out.println(sobrenome + " nao eh facil");
            } else {
                System.out.println(sobrenome + " eh facil");
            }
        }
    }

    public static boolean verifica(String sobrenome) {
        int cont = 0;

        for (int i = 0; i < sobrenome.length(); i++) {
            char letra = sobrenome.charAt(i);

            if (teste(letra)) {
                cont++;

                if (cont >= 3) {
                    return true;
                }
            } else {
                cont = 0;
            }
        }

        return false;
    }

    public static boolean teste(char letra) {
        String vogais = "AEIOU";

        return Character.isLetter(letra) && vogais.indexOf(Character.toUpperCase(letra)) == -1;
    }
}
