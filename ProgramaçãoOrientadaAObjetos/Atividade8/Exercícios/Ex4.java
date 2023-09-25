package Atividade8;

public class Ex4 {

	public static void main (String args []) {
		String s1 = "Programação";
		String s2 = "JAVA";
		String s3 = "java";
		
		System.out.println("a: " + s1.concat(s2));
		System.out.println("b: tamanho s1 = " + s1.length() + "| tamanho s2 = " + s2.length());
		System.out.println("c: primeiro caractere s1 = " + s1.charAt(0) + " | primeiro caractere s2 = " + s2.charAt(0) + " | concatenados: " + s1.charAt(0)+s2.charAt(0));
		
		boolean teste = s1.contains("@");
		if (teste) System.out.println("d: s1 contém @");
		else System.out.println("d: s1 não contém @");
		
		int num = 13;
		StringBuffer buffer = new StringBuffer(s2);
		buffer.append(String.valueOf(num));
		s2 = buffer.toString();
		System.out.println("e: " + s2);
	}
}
