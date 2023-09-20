import java.util.Scanner;

public class Bee1103 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int h1 = s.nextInt(); int m1 = s.nextInt();
		int h2 = s.nextInt(); int m2 = s.nextInt();
		int minutos = 0;
		
		while (h1 != 0 || h2 != 0 || m1 != 0 || m2 != 0) {
			
			minutos = 0;
			
			/*if (h1 < h2) {
				if (m1 == m2) {
					minutos = (h2-h1)*60;	
				}
				else if (m1 > m2) {
					minutos = ((h2-h1)*60)+(m1-m2);
				}
				else if (m1 < m2) {
					minutos = ((h2-h1)*60)+(m2-m1);
				}
			}
			
			else if (h1 == h2) {
				if (m1 > m2) {
					minutos = (24*60)-(m1-m2);
				}
				else if (m1 < m2) {
					minutos = (24*60)-(m2-m1);
				}
				else if (m1 == m2) {
					minutos = (24*60);			
				}
			}*/
			
			if (h1 > h2) {
			    minutos = ((24 - h1) * 60 - m1) + (h2 * 60 + m2);
			} 
			
			else if (h1 < h2) {
			    minutos = (h2 - h1) * 60 + (m2 - m1);
			} 
			
			else {
			    if (m1 > m2) {
			        minutos = (24 * 60) - (m1 - m2);
			    } 
			    else if (m1 < m2) {
			        minutos = m2 - m1;
			    }
			}
			
			System.out.println (minutos);
			
			h1 = s.nextInt(); m1 = s.nextInt();
			h2 = s.nextInt(); m2 = s.nextInt();
		}
	}
}
