import java.util.Scanner;

public class Bee2866 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int qtd = s.nextInt();

        for (int i = 0; i < qtd; i++) {
            String frase = s.next();				 //pega as letras minúsculas
            String minúsculas[] = frase.replaceAll("[^a-z]", "").split("");
            for (int j = minúsculas.length-1; j>=0; j--) {
                System.out.print(minúsculas[j]);
            }
            System.out.println();
        }
    }
}