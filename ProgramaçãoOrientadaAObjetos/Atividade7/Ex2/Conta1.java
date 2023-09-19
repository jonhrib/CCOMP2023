package Ex2;

public class Conta1 {
	protected double saldo;
	
	public Conta1 (double saldo) {
		this.saldo = saldo;
	}
	
	public void mostrarSaldo() {
		System.out.println("O saldo atual: " + this.getSaldo());
	}
	
	public void depositar(double valor) {
		this.saldo += valor; 
	}
	
	public void saca(double valor) throws ContaExcecao {
		
		if (valor > this.saldo) {
			throw new ContaExcecao();
		}
		else {
			this.saldo -= valor;
			System.out.println("Saque realizado!!");
		}
		
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
