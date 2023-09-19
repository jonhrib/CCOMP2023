package Ex2;

public class Main {

	public static void main (String args []) {
		ContaPoupança cont1 = new ContaPoupança("0001","Jorginho Alberto",600,"47124","0083","Estudante");
		
		cont1.imprimirExtrato();
		cont1.somarSaldo(100);
		cont1.imprimirExtrato();
	}
}
