import java.util.Scanner;

public class Bee2927 {

    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int numAlunos = s.nextInt();
    	int numPc = s.nextInt();
    	int qtsPcsQuebrados = s.nextInt();
    	int qtsPcsSemComp = s.nextInt();
    	
    	if (numPc - qtsPcsQuebrados - qtsPcsSemComp > numAlunos) {
    		System.out.println("Igor feliz!");
    	}
    	else {
    		if (qtsPcsQuebrados > qtsPcsSemComp / 2) {
    			System.out.println("Caio, a culpa eh sua!");	
    		}
    		else System.out.println("Igor bolado!");
    	}
    }
    
}