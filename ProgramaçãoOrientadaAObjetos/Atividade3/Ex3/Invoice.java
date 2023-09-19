//Aluno: João Vitor de Souza Ribeiro 2ºAno - C.Comp
package Ex03;
import java.util.Scanner;

public class Invoice {
	Scanner s = new Scanner (System.in);
	
	private String cod;
	private String descrição;
	private int qtd;
	private double valor;
	private int cont = 0, contaux = 0;
	
	public void Invoice() {
		contaux++;
		setCod();
		setDescrição();
		setQtd();
		setValor();
		teste(this.qtd,this.valor);
		if (this.contaux > 1) {
			this.cont = 0;
			this.contaux = 1;
		}
	}
	
	private void teste (int qtd, double valor) {
		if (this.qtd < 0) this.qtd = 0;
		if (this.valor < 0) this.valor = 0;
	}
	
	public void print(double valor) {
		if (contaux > 0) {
		System.out.println("+------------- FATURA ATUAL -------------+");
		System.out.println("Código: " + getCod());
		System.out.println("Descrição do item: " + getDescrição());
		System.out.println(getQtd() + " itens faturados no valor individual de R$ " + getValor() + " cada.");
		if (this.cont > 0) {
			System.out.println("O total da Fatura é de R$ " + valor);
		}
		System.out.println("+----------------------------------------+");
		}
		else System.out.println("Você não inseriu nenhum item! Volte para o MENU e escolha a opção 1.");
	}
	
	public double getInvoiceAmount () {
		double total = 0;
		if (contaux > 0) {
		System.out.println ("O valor total da fatura foi calculado! Imprima a fatura para visualizá-lo.");
		cont++;
		total = this.valor*this.qtd;
		}
		else System.out.println("Você não inseriu nenhum item! Volte para o MENU e escolha a opção 1.");
		return total;
	}
	
	public String getCod() {
		return cod;
	}
	public void setCod () {
		System.out.println("Digite o código do item: ");
		this.cod = s.next();
	}
	public String getDescrição () {
		return descrição;
	}
	public void setDescrição () {
		s.nextLine();
		System.out.println("Digite a descrição do item: ");
		this.descrição = s.nextLine();
	}
	public int getQtd () {
		return qtd;
	}
	public void setQtd () {
		System.out.println("Digite a quantidade de itens: ");
		this.qtd = s.nextInt();
	}
	public double getValor () {
		return valor;
	}
	public void setValor () {
		System.out.println("Digite o valor unitário do item: ");
		this.valor = s.nextDouble();
	}
}
