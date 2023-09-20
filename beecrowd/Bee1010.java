import java.util.Scanner;

public class Bee1010 {
 public static void main (String args []) {
  Scanner s = new Scanner (System.in);
  int cod1 = s.nextInt (); int n1 = s.nextInt (); double v1 = s.nextDouble ();
  int cod2 = s.nextInt (); int n2 = s.nextInt (); double v2 = s.nextDouble ();
  double total;
  total = (n1*v1)+(n2*v2);
  System.out.printf ("VALOR A PAGAR: R$ %.2f%n", total);
  s.close();
 }
 
}
