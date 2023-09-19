package herança2;

public class Aluno extends Pessoa {
	private String matricula;

	public Aluno(String matricula, String name, String cpf, String dataNasc) {
		super (name,cpf,dataNasc);
		this.matricula = matricula;
	}
	
	public void mostrarAluno() {
		System.out.println("+------------ Aluno ------------+");
		System.out.println("Nome: " + this.getName());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Data de Nascimento: " + this.getDataNasc());
		System.out.println("Matrícula: " + this.getMatricula());
		System.out.println("+-------------------------------+");
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
