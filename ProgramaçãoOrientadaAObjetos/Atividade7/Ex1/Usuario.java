package Ex1;

import java.text.DecimalFormat;

public class Usuario {
	DecimalFormat df = new DecimalFormat ("0.00");
	
	protected String nome;
	protected double peso;
	protected double altura;
	
	public Usuario (String nome, double peso, double altura) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}
	
	public Usuario () {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}
	
	public double calcularIMC () throws ArithmeticException {
		
		if (this.altura <= 0) {
			throw new ArithmeticException();
		}
		else {
			double valor = this.peso/(Math.pow(this.altura,2));
			return valor;
		}
	}
	
	public void ImprimeDados() {
		
		try {
			System.out.println("---------------------------------------------");
			System.out.println("Nome: " + getNome());
			System.out.println("Peso: " + getPeso());
			System.out.println("Altura: " + getAltura());
			System.out.println("IMC: " + df.format(calcularIMC()));
			System.out.println("---------------------------------------------");
		}
		catch (ArithmeticException e) {
			System.err.println("Excessão: " + e);
			System.out.println("Utilize valores diferentes de 0 para a altura");
			System.out.println("Tchau, Tchau!");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
