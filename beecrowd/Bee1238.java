import java.util.Scanner;

public class Bee1238 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int qtd;

        qtd = Integer.parseInt(s.nextLine());;
        for (int i = 0; i < qtd; i++) {
            String[] cadeias = s.nextLine().split(" ");
            String combinadas = combinando(cadeias[0], cadeias[1]);
            System.out.println(combinadas);
        }
    }

    public static String combinando (String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int max = Math.max(s1.length(), s2.length());

        for (int i = 0; i < max; i++) {
            if (i < s1.length()) {
                result.append(s1.charAt(i));
            }
            if (i < s2.length()) {
                result.append(s2.charAt(i));
            }
        }

        return result.toString();
    }
}
