//Aluno: João Vitor de Souza Ribeiro 2ºAno - C.Comp
package Ex02;
import java.util.Scanner;

public class Pessoa {
	Scanner s = new Scanner (System.in);
	
	private String nome;
	private String cpf;
	private int idade;
	private double altura;
	private double peso;
	private double imc;
	
	public void Pessoa () {
		this.nome = "Robson Andrade";
		this.cpf = "02569856956";
		this.cpf = formatarCPF(this.cpf);
		this.idade = 25;
		this.altura = 1.68;
		this.peso = 87.9;
		this.imc = IMC(this.peso,this.altura);
	}
	
	public void Pessoa (String n) {
		this.nome = n;
		setCpf();
		this.cpf = formatarCPF(this.cpf);
		setIdade();
		setAltura();
		setPeso();
		this.imc = IMC(this.peso,this.altura);
	}
	
	public static String formatarCPF(String cpf) {
	    cpf = cpf.replaceAll("[^0-9]", "");
	        // Aplica a formatação do CPF (###.###.###-##)
	    return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9);
   }
	
	public double IMC (double peso, double altura) {
		double valor = 0;
		valor = peso/(Math.pow(altura, 2));
		return valor;
	}
	
	public double getIMC () {
		return imc;
	}
	
	public String getIMCinfo () {
		String info;
		if (this.imc <= 18.5) info = "MAGREZA";
		else if (this.imc <= 24.9) info = "NORMALIDADE";
		else if (this.imc <= 29.9) info = "SOBREPESO";
		else if (this.imc <= 39.9) info = "OBESIDADE";
		else info = "OBESIDADE GRAVE";
		return info;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf() {
		System.out.println("Digite o CPF - sem pontos ou espaços - : ");
		this.cpf = s.nextLine();
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade() {
		System.out.println("Digite a idade da Pessoa: ");
		this.idade = s.nextInt();
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura() {
		System.out.println("Digite a altura da Pessoa (em metros): ");
		this.altura = s.nextDouble();
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso() {
		System.out.println("Digite o peso da Pessoa (em kg): ");
		this.peso = s.nextDouble();
	}
}