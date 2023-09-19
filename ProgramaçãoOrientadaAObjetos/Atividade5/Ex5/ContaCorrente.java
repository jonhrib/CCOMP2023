package Ex5;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(double saldo) {
		super(saldo);
	}
	
	public void atualiza(int taxa) {
		super.atualiza(taxa*2);
	}
	
	public void depositar(double valor) {
		super.depositar(valor-0.10);
	}
}
