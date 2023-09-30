import java.util.Scanner;

public class Bee2253 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		while (s.hasNext()) {
			 String senha = s.nextLine();
			 if (senha.length() > 5 && senha.length() < 33) {
				 if ((!senha.matches("^[a-zA-Z0-9]*$"))) {
					 System.out.println("Senha invalida.");
				 }
				 else {
					 boolean maiuscula = false;
					 boolean minuscula = false;
					 boolean numero = false;
					 
					 for (char c : senha.toCharArray()) {
						 
						 if (Character.isUpperCase(c)) {
			                   	maiuscula = true;
			                } 
						 else if (Character.isLowerCase(c)) {
			                    minuscula = true;
			                } 
						 else if (Character.isDigit(c)) {
			                    numero = true;
			                }
						 if (maiuscula && minuscula && numero) {
			                    break; // Todos os requisitos foram atendidos, não é necessário continuar verificando
			                }
					 }
					 
					 if (maiuscula && minuscula && numero) System.out.println("Senha valida.");
					 else System.out.println("Senha invalida.");
				 }
			 }
			 else System.out.println("Senha invalida.");
		}
	}
}
