import java.io.IOException;
import java.util.Scanner;

public class Bee2139 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int mes, dia, faltando;
    	String[] data;
    	while (leitor.hasNext()) {
    		data = leitor.nextLine().split(" ");
    		mes = Integer.parseInt(data[0]);
    		dia = Integer.parseInt(data[1]);
    		faltando = ((12 - mes) * 30) + (30 - dia);
    		
    		if (mes == 2) faltando -= 1;
    		if (mes == 4) faltando -= 1;
    		if (mes == 5) faltando -= 1;
    		if (mes == 8) faltando += 1;
    		if (mes == 11) faltando -=1;
    		if (mes > 5) faltando -= 2;
    		if (mes > 7) faltando -= 2;
    		if (mes > 11) faltando -= 1;
    		
    		if (faltando == 1) System.out.println("E vespera de natal!");
    		else if (faltando == 0) System.out.println("E natal!");
    		else if (faltando < 0) System.out.println("Ja passou!");
    		else System.out.println("Faltam " + faltando + " dias para o natal!");
    	}
    }
	
}