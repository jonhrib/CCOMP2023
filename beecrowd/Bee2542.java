import java.util.Scanner;

public class Bee2542 {

	public static void main(String args []) {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int nAtributos = leitor.nextInt();
			int nCartasMarcos = leitor.nextInt();
			int nCartasLeonardo = leitor.nextInt();
			int[][] atributosCartasMarcos = new int[nCartasMarcos][nAtributos];
			int[][] atributosCartasLeonardo = new int[nCartasLeonardo][nAtributos];
			for (int i = 0; i < nCartasMarcos; i++)	{
				for (int j = 0; j < nAtributos; j++) {
					atributosCartasMarcos[i][j] = leitor.nextInt();
				}
			}
			for (int i = 0; i < nCartasLeonardo; i++) {
				for (int j = 0; j < nAtributos; j++) {
					atributosCartasLeonardo[i][j] = leitor.nextInt();
				}
			}
			int cartaEscolhidaMarcos = leitor.nextInt() -1;
			int cartaEscolhidaLeonardo = leitor.nextInt() -1;
			int atributoSorteado = leitor.nextInt() -1;
			int marcos = atributosCartasMarcos[cartaEscolhidaMarcos][atributoSorteado];
			int leonardo = atributosCartasLeonardo[cartaEscolhidaLeonardo][atributoSorteado];
			if (marcos == leonardo) 
				System.out.println("Empate");
			else if (marcos > leonardo)
				System.out.println("Marcos");
			else
				System.out.println("Leonardo");
		}
	}
	
}
