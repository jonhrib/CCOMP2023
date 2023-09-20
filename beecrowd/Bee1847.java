import java.util.Scanner;

public class Bee1847 {

	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int diaa = s.nextInt();
		int diab = s.nextInt();
		int diac = s.nextInt();
		if (diab < diaa && diac >= diab) System.out.println(":)");
        else if (diab > diaa && diac <= diab) System.out.println(":(");
        else if (diab > diaa && diac > diab && (diac - diab) < (diab - diaa)) System.out.println(":(");
        else if (diab > diaa && diac > diab && (diac - diab) >= (diab - diaa)) System.out.println(":)");
        else if (diab < diaa && diac < diab && (diab - diac) < (diaa - diab)) System.out.println(":)");
        else if (diab < diaa && diac < diab && (diab - diac) >= (diaa - diab)) System.out.println(":(");
        else if (diab == diaa && diac > diab) System.out.println(":)");
        else if (diab == diaa && diac < diab) System.out.println(":(");
        else System.out.println(":(");
		s.close();
	}
}
