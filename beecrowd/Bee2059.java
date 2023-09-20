import java.util.Scanner;

public class Bee2059 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int p,jog1,jog2,roubo,acusa;
		p = s.nextInt();
		jog1 = s.nextInt();
		jog2 = s.nextInt();
		roubo = s.nextInt();
		acusa = s.nextInt();
		if (p == 1) {
			if (((jog1+jog2)%2 == 0) && (roubo == 0) && (acusa == 0)) {
				System.out.println ("Jogador 1 ganha!");
			}
			else if (((jog1+jog2)%2 == 0) && (roubo == 1) && (acusa == 0)) {
				System.out.println ("Jogador 1 ganha!");
			}
			else if (((jog1+jog2)%2 == 0) && (roubo == 0) && (acusa == 1)) {
				System.out.println ("Jogador 1 ganha!");
			}
			else if (((jog1+jog2)%2 != 0) && (roubo == 1) && (acusa == 0)) {
				System.out.println ("Jogador 1 ganha!");
			}
			else if (((jog1+jog2)%2 != 0) && (roubo == 1) && (acusa == 1)) {
				System.out.println ("Jogador 2 ganha!");
			}
			else if (((jog1+jog2)%2 != 0) && (roubo == 0) && (acusa == 0)) {
				System.out.println ("Jogador 2 ganha!");
			}
		}
		else if (p == 0) {
			if (((jog1+jog2)%2 != 0) && (roubo == 0) && (acusa == 0)) {
				System.out.println ("Jogador 1 ganha!");
			}
			else if (((jog1+jog2)%2 != 0) && (roubo == 1) && (acusa == 0)) {
				System.out.println ("Jogador 1 ganha!");
			}
			else if (((jog1+jog2)%2 != 0) && (roubo == 0) && (acusa == 1)) {
				System.out.println ("Jogador 1 ganha!");
			}
			else if (((jog1+jog2)%2 == 0) && (roubo == 1) && (acusa == 0)) {
				System.out.println ("Jogador 1 ganha!");
			}
			else if (((jog1+jog2)%2 == 0) && (roubo == 1) && (acusa == 1)) {
				System.out.println ("Jogador 2 ganha!");
			}
			else if (((jog1+jog2)%2 == 0) && (roubo == 0) && (acusa == 0)) {
				System.out.println ("Jogador 2 ganha!");
			}
			
		}
		s.close();
	}
}
