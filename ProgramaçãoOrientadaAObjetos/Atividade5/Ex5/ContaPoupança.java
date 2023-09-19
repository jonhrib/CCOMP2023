package Ex5;

public class ContaPoupança extends Conta {
	
	public ContaPoupança(double saldo) {
		super(saldo);
	}
	
	public void atualiza(int taxa) {
		super.atualiza(taxa*3);
	}
}
