import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bee3140 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder textoBuilder = new StringBuilder();

        System.out.println("Digite o texto (pressione Ctrl+D em uma nova linha para finalizar):");
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            textoBuilder.append(linha).append("\n");
        }
        String texto = textoBuilder.toString();

        List<String> linhasCorpo = extrairLinhasCorpo(texto);

        for (String linhaCorpo : linhasCorpo) {
            System.out.println(linhaCorpo);
        }
    }

    public static List<String> extrairLinhasCorpo(String texto) {
        List<String> linhasCorpo = new ArrayList<>();
        boolean dentroDoCorpo = false;

        String[] linhas = texto.split("\n");

        for (String linha : linhas) {
            if (linha.contains("<body>")) {
                dentroDoCorpo = true;
                continue;
            } else if (linha.contains("</body>")) {
                dentroDoCorpo = false;
                break;
            }

            if (dentroDoCorpo) {
                linhasCorpo.add(linha);
            }
        }

        return linhasCorpo;
    }
}
