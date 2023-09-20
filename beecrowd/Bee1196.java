import java.util.Scanner;

public class Bee1196 {
	
	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		
		String palavra = s.nextLine();
		char[] vetor = palavra.toCharArray();
		
		for (int i = 0; i < vetor.length; i++) {
			
			if (vetor[i] == 'W') vetor[i] = 'Q';
			else if (vetor[i] == 'E') vetor[i] = 'W';
			else if (vetor[i] == 'R') vetor[i] = 'E';
			else if (vetor[i] == 'T') vetor[i] = 'R';
			else if (vetor[i] == 'Y') vetor[i] = 'T';
			else if (vetor[i] == 'U') vetor[i] = 'Y';
			else if (vetor[i] == 'I') vetor[i] = 'U';
			else if (vetor[i] == 'O') vetor[i] = 'I';
			else if (vetor[i] == 'P') vetor[i] = '0';
			else if (vetor[i] == '[') vetor[i] = 'P';
			else if (vetor[i] == ']') vetor[i] = '[';
			else if (vetor[i] == '\\') vetor[i] = ']';
			
			else if (vetor[i] == 'S') vetor[i] = 'A';
			else if (vetor[i] == 'D') vetor[i] = 'S';
			else if (vetor[i] == 'F') vetor[i] = 'D';
			else if (vetor[i] == 'G') vetor[i] = 'F';
			else if (vetor[i] == 'H') vetor[i] = 'G';
			else if (vetor[i] == 'J') vetor[i] = 'H';
			else if (vetor[i] == 'K') vetor[i] = 'J';
			else if (vetor[i] == 'L') vetor[i] = 'K';
			else if (vetor[i] == ';') vetor[i] = '\'';
			
			else if (vetor[i] == 'X') vetor[i] = 'Z';
			else if (vetor[i] == 'C') vetor[i] = 'X';
			else if (vetor[i] == 'V') vetor[i] = 'C';
			else if (vetor[i] == 'B') vetor[i] = 'V';
			else if (vetor[i] == 'N') vetor[i] = 'B';
			else if (vetor[i] == 'M') vetor[i] = 'N';
			else if (vetor[i] == ',') vetor[i] = 'M';
			else if (vetor[i] == '.') vetor[i] = ',';
			else if (vetor[i] == '/') vetor[i] = '.';
			
			else if (vetor[i] == '1') vetor[i] = '`';
			else if (vetor[i] == '2') vetor[i] = '1';
			else if (vetor[i] == '3') vetor[i] = '2';
			else if (vetor[i] == '4') vetor[i] = '3';
			else if (vetor[i] == '5') vetor[i] = '4';
			else if (vetor[i] == '6') vetor[i] = '5';
			else if (vetor[i] == '7') vetor[i] = '6';
			else if (vetor[i] == '8') vetor[i] = '7';
			else if (vetor[i] == '9') vetor[i] = '8';
			else if (vetor[i] == '0') vetor[i] = '9';
			else if (vetor[i] == '-') vetor[i] = '0';
			else if (vetor[i] == '=') vetor[i] = '-';
		}
		
		for (char c : vetor) {
            System.out.print (c);
        }
	}
}