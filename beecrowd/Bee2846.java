import java.util.ArrayList;
import java.util.Scanner;

public class Bee2846 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        int fibMax = 2; // maior número da sequência de Fibonacci até o momento
        int fibPrev = 1; // número anterior na sequência de Fibonacci
        int fibCurr = 1; // número atual na sequência de Fibonacci

        ArrayList<Integer> fibonotSequence = new ArrayList<>();

        while (fibonotSequence.size() < k) {
            int fibNext = fibPrev + fibCurr; // próximo número na sequência de Fibonacci

            for (int i = fibMax + 1; i < fibNext; i++) {
                fibonotSequence.add(i); // adiciona números ausentes à sequência de Fibonot
            }

            fibMax = fibNext;
            fibPrev = fibCurr;
            fibCurr = fibNext;
        }

        int kthFibonot = fibonotSequence.get(k - 1); // índice é baseado em 0, então subtraímos 1

        System.out.println(kthFibonot);
    }
}
