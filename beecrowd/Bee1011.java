import java.util.Scanner;

public class Bee1011 {
 public static void main (String args []) {
  Scanner s = new Scanner (System.in);
  double r = s.nextDouble();
  double raio = (4/3.0)*3.14159*(r*r*r);
  System.out.printf ("VOLUME = %.3f%n", raio);
  s.close();
 }
 
}
