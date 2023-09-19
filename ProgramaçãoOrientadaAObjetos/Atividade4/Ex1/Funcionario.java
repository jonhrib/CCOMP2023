package herança2;

public class Funcionario extends Pessoa {
	protected String matricula;
	protected String  dataAdmissao;
	protected double salario;

	public Funcionario(String name, String cpf, String dataNasc, String matricula, String dataAdmissao, double salario) {
		super (name,cpf,dataNasc);
		this.matricula = matricula;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}
	
	public void mostrarFuncionario() {
		System.out.println("+------------ Funcionário ------------+");
		System.out.println("Nome: " + this.getName());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Data de Nascimento: " + this.getDataNasc());
		System.out.println("Matrícula: " + this.getMatricula());
		System.out.println("Data de Admissão: " + this.getDataAdmissao());
		System.out.println("Salário: R$" + this.getSalario());
		System.out.println("+-------------------------------------+");
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
