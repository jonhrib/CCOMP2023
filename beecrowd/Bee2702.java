import java.util.Scanner;

public class Bee2702 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int frango = s.nextInt();
		int bife = s.nextInt();
		int massa = s.nextInt();
		int qtdfrango = s.nextInt();
		int qtdbife = s.nextInt();
		int qtdmassa = s.nextInt();
		int soma = 0;
		if (qtdfrango > frango) soma += (qtdfrango-frango);
		if (qtdbife > bife) soma += (qtdbife-bife);
		if (qtdmassa > massa) soma += (qtdmassa-massa);
		System.out.println (soma);
	}
}
