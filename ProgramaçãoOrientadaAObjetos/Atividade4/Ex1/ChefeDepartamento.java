package herança2;

public class ChefeDepartamento extends Funcionario {
	private String departamento;
	private String dataPromocao;
	private double gratificacao;
	
	public ChefeDepartamento(String name, String cpf, String dataNasc, String matricula, String dataAdmissao, double salario, String departamento, String dataPromocao, double gratificacao)  {
		super(name,cpf,dataNasc,matricula,dataAdmissao,salario);
		this.departamento = departamento;
		this.dataPromocao = dataPromocao;
		this.gratificacao = gratificacao;
	}
	
	public void mostrarChefe() {
		System.out.println("+------------ Chefe de Departamento ------------+");
		System.out.println("Nome: " + this.getName());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Data de Nascimento: " + this.getDataNasc());
		System.out.println("Matrícula: " + this.getMatricula());
		System.out.println("Departamento: " + this.getDepartamento());
		System.out.println("Data de Admissão: " + this.getDataAdmissao());
		System.out.println("Salário: R$" + this.getSalario());
		System.out.println("Data da Promoção para Chefe de Departamento: " + this.getDataPromocao());
		System.out.println("Gratificação adicional (Chefe): " + this.getGratificacao());
		System.out.println("Salário Atual: R$" + salarioatual());
		System.out.println("+-----------------------------------------------+");
	}
	
	public double salarioatual() {
		return this.salario + this.gratificacao;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getDataPromocao() {
		return dataPromocao;
	}
	public void setDataPromocao(String dataPromocao) {
		this.dataPromocao = dataPromocao;
	}
	public double getGratificacao() {
		return gratificacao;
	}
	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}
}
