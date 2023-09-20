import java.util.Scanner;

public class Bee3142 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String columnCode = scanner.next();
            int result = getColumnNumber(columnCode);
            if (result == -1 || result >= 16384) {
                System.out.println("Essa coluna nao existe Tobias!");
            } else {
                System.out.println(result);
            }
        }

        scanner.close();
    }

    private static int getColumnNumber(String columnCode) {
        int base = 26;
        int result = 0;

        for (int i = 0; i < columnCode.length(); i++) {
            int digitValue = columnCode.charAt(i) - 'A' + 1;
            if (digitValue < 1 || digitValue > 26) {
                return -1;
            }
            result = result * base + digitValue;
        }

        return result;
    }
}
