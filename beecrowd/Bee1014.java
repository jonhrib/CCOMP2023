import java.util.Scanner;

public class Bee1014 {
 public static void main (String args []) {
  Scanner s = new Scanner (System.in);
  int km = s.nextInt();
  double l = s.nextDouble();
  double consumo = km/l;
  System.out.printf ("%.3f km/l%n",consumo);
  s.close();
 }
 
}
