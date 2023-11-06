package Listas;

import java.util.ArrayList;

public class Produto {
	
	private String cod;
	private String nome;
	private double valor;
	private double peso;
	private double valorkg;
	
	public Produto (String codigo, String nome, double valor, double peso) {
		this.cod = codigo;
		this.nome = nome;
		this.valor = valor;
		this.peso = peso;
		this.valorkg = (valor/peso);
	}
	
	public void ImprimeDados () {
		System.out.println("Código: " + cod);
		System.out.println("Nome: " + nome);
		System.out.println("Valor total: R$" + valor);
		System.out.println("Peso: " + peso + " kg");
		System.out.println("Valor por kg: R$" + valorkg);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public double getValorkg() {
		return valorkg;
	}

	public void setValorkg(double valorkg) {
		this.valorkg = valorkg;
	}
}
