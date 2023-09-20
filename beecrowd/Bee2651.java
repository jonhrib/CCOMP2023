import java.util.Scanner;

public class Bee2651 {
	
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next().toLowerCase();

        if (name.contains("zelda")) { //verifica se tem "zelda" na palavra
            System.out.println("Link Bolado");
        } else {
            System.out.println("Link Tranquilo");
        }
    }
}