//Aluno: João Vitor de Souza Ribeiro 2ºAno - C.Comp
package Ex04;
import java.util.Scanner;

public class Empregado {
	Scanner s = new Scanner (System.in);
	
	private String primeiroNome;
	private String sobrenome;
	private double salarioMensal;
	
	public void Empregado () {
		setPrimeiroNome();
		setSobrenome();
		setSalarioMensal();
		teste(this.salarioMensal);
	}
	
	private void teste(double salario) {
		if (salario < 0) this.salarioMensal = 0.0;
	}
	
	public double salarioAnual() {
		return this.salarioMensal*12;
	}

	public void aumento() {
		this.salarioMensal *= 1.10;
	}
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome() {
		System.out.println("Digite o primeiro nome do funcionário: ");
		this.primeiroNome = s.next();
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome() {
		System.out.println("Digite o sobrenome do funcionário: ");
		this.sobrenome = s.next();
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal() {
		System.out.println("Digite o salário mensal do empregado: ");
		this.salarioMensal = s.nextDouble();
	}
}
