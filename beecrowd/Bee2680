import java.util.Scanner;

public class Main {
    public static void main(String args []) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Número de funcionários

        for (int i = 0; i < N; i++) {
            long matricula = scanner.nextLong(); // Número de matrícula do funcionário
            long salario = calcularSalario(matricula);
            System.out.println(salario);
        }

        scanner.close();
    }

    // Função para calcular o salário com base na soma dos divisores
    public static long calcularSalario(long matricula) {
        long salario = 0;

        for (long divisor = 1; divisor * divisor <= matricula; divisor++) {
            if (matricula % divisor == 0) {
                salario += divisor;
                if (divisor != matricula / divisor) {
                    salario += matricula / divisor;
                }
            }
        }

        return salario;
    }
}
