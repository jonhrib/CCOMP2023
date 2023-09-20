import java.text.DecimalFormat;
import java.util.Scanner;

public class Bee1048 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double valor = s.nextDouble();
		double aux = valor;
		double reajuste = 0;
		if (valor >= 0.00 && valor <= 400.00) {
			valor = (valor*0.15)+ valor;
			reajuste = valor-aux;
			System.out.printf ("Novo Salario: " + df.format(valor) + "%n");
			System.out.printf ("Reajuste ganho: " + df.format(reajuste) + "%n");
			System.out.println ("Em percentual: 15 %");
		}
		else if (valor >= 400.01 && valor <= 800.00) {
			valor = (valor*0.12)+valor;
			reajuste = valor-aux;
			System.out.printf ("Novo Salario: " + df.format(valor) + "%n");
			System.out.printf ("Reajuste ganho: " + df.format(reajuste) + "%n");
			System.out.println ("Em percentual: 12 %");
		}
		else if (valor >= 800.01 && valor <= 1200.00) {
			valor = (valor*0.10)+valor;
			reajuste = valor-aux;
			System.out.printf ("Novo Salario: " + df.format(valor) + "%n");
			System.out.printf ("Reajuste ganho: " + df.format(reajuste) + "%n");
			System.out.println ("Em percentual: 10 %");
		}
		else if (valor >= 1200.01 && valor <= 2000.00) {
			valor = (valor*0.07)+valor;
			reajuste = valor-aux;
			System.out.printf ("Novo Salario: " + df.format(valor) + "%n");
			System.out.printf ("Reajuste ganho: " + df.format(reajuste) + "%n");
			System.out.println ("Em percentual: 7 %");
		}
		else if (valor > 2000.0) {
			valor = (valor*0.04)+valor;
			reajuste = valor-aux;
			System.out.printf ("Novo Salario: " + df.format(valor) + "%n");
			System.out.printf ("Reajuste ganho: " + df.format(reajuste) + "%n");
			System.out.println ("Em percentual: 4 %");
		}
		s.close();
	}
}
