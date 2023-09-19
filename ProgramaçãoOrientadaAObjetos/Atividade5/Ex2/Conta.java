package Ex2;

public abstract class Conta {
	protected String codigo;
	protected String nomeProprietario;
	protected float saldo;
	
	public Conta(String codigo, String nomeProprietario, float saldo) {
		super();
		this.codigo = codigo;
		this.nomeProprietario = nomeProprietario;
		this.saldo = saldo;
	}
	
	abstract void somarSaldo(float s);
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
}
