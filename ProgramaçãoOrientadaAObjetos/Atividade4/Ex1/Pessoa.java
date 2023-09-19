package herança2;

public class Pessoa {
	protected String name;
	protected String cpf;
	protected String dataNasc;
	
	public Pessoa(String name, String cpf, String dataNasc) {
		super();
		this.name = name;
		this.cpf = formatCPF(cpf);
		this.dataNasc = dataNasc;
	}
	
	public static String formatCPF(String cpf) {
	    cpf = cpf.replaceAll("[^0-9]", "");
	        // Aplica a formatação do CPF (###.###.###-##)
	    return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9);
   }
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
}
