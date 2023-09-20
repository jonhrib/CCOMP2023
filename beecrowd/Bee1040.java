import java.text.DecimalFormat;
import java.util.Scanner;

public class Bee1040 {
	public static void main (String args[]) {
		DecimalFormat df = new DecimalFormat("0.0");
		Scanner s = new Scanner (System.in);
		double n1 = s.nextDouble();
		double n2 = s.nextDouble();
		double n3 = s.nextDouble();
		double n4 = s.nextDouble();
		double media = (((n1*2.0)+(n2*3.0)+(n3*4.0)+(n4*1.0))/10.0);
		System.out.printf ("Media: " + df.format(media) + "%n");
		if (media >= 7.0) {
			System.out.println ("Aluno aprovado.");
		}
		else if (media < 5.0) {
			System.out.println ("Aluno reprovado.");
		}
		else if (media >= 5.0 || media <= 6.9) {
			System.out.println ("Aluno em exame.");
			double ex = s.nextDouble();
			System.out.printf ("Nota do exame: "+ df.format(ex) + "%n");
			media = ((media+ex)/2.0);
			if (media >= 5.0) {
				System.out.println ("Aluno aprovado.");
			}
			else if (media <= 4.9) {
				System.out.println ("Aluno reprovado.");
			}
			System.out.printf ("Media final: " + df.format(media) + "%n");
		}
		s.close();
	}
}
