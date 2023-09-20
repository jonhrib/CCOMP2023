import java.util.Scanner ;

public class Bee1192 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int qtd = s.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			String teste = s.next();
			String num [] = teste.split("\\D+");
			String[] texto = teste.split("\\d+");
			int numint[] = new int [num.length];
			
			numint[0] = Integer.parseInt(num[0]);
			numint[1] = Integer.parseInt(num[1]);
			
			//System.out.println (texto[1] + " " + numint[0] + " " + numint[1]);
			//char letra[] = new char [texto.length]; 
			char letra = texto[1].charAt(0);
			int aux = 0;
			
			if (numint[0] == numint[1]) {
				aux = numint[0]*numint[1];
			}
			else if (Character.isUpperCase(letra)) {
				aux = numint[1]-numint[0];
			}
			else if (Character.isLowerCase(letra)) {
				aux = numint[0]+numint[1];
			}
			
			System.out.println (aux);
		}
	}
}
