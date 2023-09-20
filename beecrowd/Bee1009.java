import java.util.Scanner;

public class Bee1009 {
 public static void main (String args []) {
  Scanner s = new Scanner (System.in);
  String nome = s.next();
  double sal = s.nextDouble();
  double bonus = s.nextDouble();
  double salario = sal + (bonus*0.15);
  System.out.printf ("TOTAL = R$ %.2f%n", salario);
  s.close();
 }
 
}

