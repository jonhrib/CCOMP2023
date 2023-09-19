package Ex2;
	
public class ContaPoupança extends Conta {
	private String numConta;
	private String numAgencia;
	private String variação;
	
	public ContaPoupança(String codigo, String nomeProprietario, float saldo, String numConta, String numAgencia, String variação) {
		super(codigo,nomeProprietario,saldo);
		this.numConta = numConta;
		this.numAgencia = numAgencia;
		this.variação = variação;
	}
	
	public void imprimirExtrato() {
		System.out.print("+"); for (int i = 0; i < (35-9)/2; i++) System.out.print("-"); System.out.print(" EXTRATO ");for (int i = 0; i < (35-9)/2; i++) System.out.print("-"); System.out.println("+"); System.out.print("");
		System.out.println("Código: " + this.getCodigo());
		System.out.println("Nome: " + this.getNomeProprietario());
		System.out.println("Conta e Agência: " + this.getNumConta() + "-" + this.getNumAgencia());
		System.out.println("Variação de Conta: " + this.getVariação());
		System.out.println("Saldo atual: " + this.getSaldo());
		System.out.print("+"); for (int i = 0; i < 35; i++) System.out.print("-"); System.out.print("+"); System.out.println();
	}

	@Override
	void somarSaldo(float s) {
		this.saldo = saldo + s;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public String getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(String numAgencia) {
		this.numAgencia = numAgencia;
	}

	public String getVariação() {
		return variação;
	}

	public void setVariação(String variação) {
		this.variação = variação;
	}
}
