package Ex5;

public class Conta {
	protected double saldo;
	
	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public void mostrarSaldo() {
		System.out.println("O saldo atual: " + this.getSaldo());
	}
	
	public void depositar(double valor) {
		this.saldo += valor; 
	}
	
	public void sacar(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque realizado!!");
		}
		else System.out.println("O valor a ser sacado é maior que o saldo disponível");
	}
	
	public void atualiza (int taxa) {
		double porc = this.saldo*((double) taxa/100);
		this.saldo = saldo + porc;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
