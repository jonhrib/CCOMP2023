package Objeto;

public class Produções {
	
	private char futuro;
	private char atual;
	private char terminal;
	private String total;
//	private int passou;
	private int pos;
	
	
	public Produções(String ordem, int tipo) {
		if (tipo == 1) {
			this.pos = 0;
		//	this.passou = 0;
			this.futuro = ordem.charAt(3);
			this.atual = ordem.charAt(0);
			this.terminal = ordem.charAt(2);
			this.total = ordem;
		}
		else if (tipo == 2) {
			this.pos = 0;
		//	this.passou = 0;
			this.futuro = ordem.charAt(2);
			this.atual = ordem.charAt(0);
			this.terminal = ordem.charAt(3);
			this.total = ordem;
		}
	}


	public char getFuturo() {
		return futuro;
	}


	public void setFuturo(char futuro) {
		this.futuro = futuro;
	}


	public char getAtual() {
		return atual;
	}


	public void setAtual(char atual) {
		this.atual = atual;
	}


	public char getTerminal() {
		return terminal;
	}


	public void setTerminal(char terminal) {
		this.terminal = terminal;
	}


	public String getTotal() {
		return total;
	}


	public void setTotal(String total) {
		this.total = total;
	}


//	public int getPassou() {
//		return passou;
//	}
//
//
//	public void setPassou(int passou) {
//		this.passou += passou;
//	}


	public int getPos() {
		return pos;
	}


	public void setPos(int pos) {
		this.pos = pos;
	}
}
