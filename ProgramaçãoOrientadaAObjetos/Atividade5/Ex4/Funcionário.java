package Ex4;

class Funcionário extends Pessoa {
	private double salario;
	
	public Funcionário(int codigo, String nome, String telefone, String endereço, double salario) {
		super(codigo,nome,telefone,endereço);
		this.salario = salario;
	}
	
	public void imprimeDados() {
		super.imprimeDados();
		System.out.println("Salário: R$" + this.getSalario());
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
