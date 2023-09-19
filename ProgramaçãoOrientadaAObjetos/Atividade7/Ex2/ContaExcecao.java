package Ex2;

public class ContaExcecao extends Exception {

	public ContaExcecao () {
		System.out.println("SAQUE CANCELADO! O valor que você está sacando é maior que seu saldo!");
	}
}
