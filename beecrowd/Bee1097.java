public class Bee1097 {

	public static void main (String args []) {
		int a = 7;
		for (int i = 1; i < 10; i = i + 2){
            for (int j = a; j > (a - 3); j--){
                System.out.println("I=" + i + " J=" + j);
            }
            a = a + 2;
		}
	}
}
