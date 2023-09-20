import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bee3161 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Quantidade de nomes de frutas a serem verificados
        int m = scanner.nextInt(); // Quantidade de linhas da lista de nomes de frutas

        List<String> listaFrutas = new ArrayList<>();

        // Ler a lista de nomes de frutas
        for (int i = 0; i < m; i++) {
            String fruta = scanner.next().toLowerCase();
            listaFrutas.add(fruta);
        }

        // Verificar os nomes das frutas
        for (int i = 0; i < n; i++) {
            String nomeFruta = scanner.next().toLowerCase();

            boolean sheldonGosta = verificarGostoSheldon(nomeFruta, listaFrutas);

            if (sheldonGosta) {
                System.out.println("Sheldon come a fruta " + nomeFruta);
            } else {
                System.out.println("Sheldon detesta a fruta " + nomeFruta);
            }
        }

        scanner.close();
    }

    private static boolean verificarGostoSheldon(String nomeFruta, List<String> listaFrutas) {
        for (String fruta : listaFrutas) {
            if (verificarIgualdade(nomeFruta, fruta)) {
                return true;
            }
        }
        return false;
    }

    private static boolean verificarIgualdade(String nomeFruta, String fruta) {
        if (nomeFruta.equals(fruta)) {
            return true;
        }

        String frutaInvertida = new StringBuilder(fruta).reverse().toString();
        if (nomeFruta.equals(frutaInvertida)) {
            return true;
        }

        if (nomeFruta.length() != fruta.length()) {
            return false;
        }

        int n = nomeFruta.length();
        for (int i = 0; i < n; i++) {
            char cNome = nomeFruta.charAt(i);
            char cFruta = fruta.charAt(i);

            if (Character.isUpperCase(cNome)) {
                cNome = Character.toLowerCase(cNome);
            }

            if (Character.isUpperCase(cFruta)) {
                cFruta = Character.toLowerCase(cFruta);
            }

            if (cNome != cFruta) {
                return false;
            }
        }

        return true;
    }
}
