import java.util.Scanner;

public class Bee1008 {
 public static void main (String args []) {
	Scanner s = new Scanner (System.in);
	int num = s.nextInt();
	int horas = s.nextInt();
	double valor = s.nextDouble();
	double sal = horas*valor;
	System.out.println ("NUMBER = " + num);
	System.out.printf ("SALARY = U$ %.2f%n", sal);
	s.close();
 }
 
}
