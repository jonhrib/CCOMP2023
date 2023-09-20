import java.util.Scanner;

public class Bee1049 {

	public static void main (String args[]) {
		Scanner s = new Scanner (System.in);
		String a = s.next();
		String b = s.next();
		String c = s.next();
		 if (a.equalsIgnoreCase("vertebrado")) {
			 if (b.equalsIgnoreCase("ave")) {
				 if (c.equalsIgnoreCase("carnivoro")) {
					 System.out.println ("aguia");
				 }
				 else {
					 System.out.println ("pomba"); 
				 }
			 }
			 else {
				 if (c.equalsIgnoreCase("onivoro")) {
					 System.out.println ("homem");
				 }
				 else {
					 System.out.println ("vaca");
				 }
			 }
		 }
		 else if (a.equalsIgnoreCase("invertebrado")) {
			 if (b.equalsIgnoreCase("inseto")) {
				 if (c.equalsIgnoreCase("hematofago")) {
					 System.out.println ("pulga");
				 }
				 else {
					 System.out.println ("lagarta"); 
				 }
			 }
			 else {
				 if (c.equalsIgnoreCase("hematofago")) {
					 System.out.println ("sanguessuga");
				 }
				 else {
					 System.out.println ("minhoca");
				 }
			 }
		 }
		 s.close();
	}
}
