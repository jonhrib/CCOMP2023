import java.util.Scanner;

public class Bee1973 {
	
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);	
    	int n = s.nextInt();
    	int[] estrela = new int[n];
    	int[] carneiro = new int[n];
    	long totalEstrela = 0;
    	long totalCarneiro = 0;
    	
    	for (int i = 0; i < n; i++) {
	    	carneiro[i] = s.nextInt();
	    	estrela[i] = 0;
    	}
    	
    	int j = 0;
    	
    	while (true) {
    		if (j == 0 && carneiro[j] % 2 == 0){
    			estrela[j] = 1;
    			if (carneiro[j] > 0) carneiro[j]--;
    			break;
    		} else if (j == (n-1) && carneiro[j] % 2 == 1) {
    			estrela[j] = 1;
    			if (carneiro[j] > 0) carneiro[j]--;
    			break;
    		} else if (carneiro[j] % 2 == 1) {
    			if (carneiro[j] > 0) carneiro[j]--;
    			estrela[j] = 1;
    			j++;
    		} else if (carneiro[j] % 2 == 0) {
    			estrela[j] = 1;
    			if (carneiro[j] > 0) carneiro[j]--;
    			j--;
    		}
    	}
    	
    	for (int i = 0; i < n; i++) {
    		totalCarneiro += carneiro[i];
    		totalEstrela += estrela[i];
    	}
    	
    	System.out.println(totalEstrela + " " + totalCarneiro);
    	s.close();
    }
	
}