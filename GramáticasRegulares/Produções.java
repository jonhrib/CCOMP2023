package Objeto;

public class Produções { // classe Produções 
	
	private char futuro; // atributo futuro que irá receber a variável futura da ordem de produção
	private char atual; // atributo atual que irá receber a variável atual da ordem de produção
	private char terminal; // atributo terminal que irá receber o terminal da ordem de produção
	private String total; // atributo total que receberá a ordem de produção inteira
//	private int passou;
	private int pos; // atributo pos que receberá a posição em que a ordem foi recebida
	
	
	public Produções(String ordem, int tipo) { // construtor que recebe a ordem em String e o tipo (GLUD ou GLUE)
		
		if (tipo == 1) { // se GLUD
			this.pos = 0; // a posição começa como 0 inicialmente
		//	this.passou = 0;
			this.futuro = ordem.charAt(3); // futuro recebe a posição 3 da ordem, ou seja, a última
			this.atual = ordem.charAt(0); // atual recebe a posição 0 da ordem, ou seja, a primeira
			this.terminal = ordem.charAt(2); // terminal recebe a posição 2 da ordem, ou seja, a penúltima
			this.total = ordem; // total recebe a ordem completa
		}
		
		else if (tipo == 2) { // se GLUE
			this.pos = 0; // a posição começa como 0 inicialmente
		//	this.passou = 0;
			this.futuro = ordem.charAt(2); // futuro recebe a posição 2 da ordem, ou seja, a penúltima
			this.atual = ordem.charAt(0); // atual recebe a posição 0 da ordem, ou seja, a primeira
			this.terminal = ordem.charAt(3); // terminal receba a posição 3 da ordem, ou seja, a última
			this.total = ordem; // total recebe a ordem completa
		}
	}


	public char getFuturo() { // get de futuro
		return futuro;
	}


	public void setFuturo(char futuro) { // set de futuro
		this.futuro = futuro;
	}


	public char getAtual() { // get de atual
		return atual;
	}


	public void setAtual(char atual) { // set de atual
		this.atual = atual;
	}


	public char getTerminal() { // get de terminal
		return terminal;
	}


	public void setTerminal(char terminal) { // set de terminal
		this.terminal = terminal;
	}


	public String getTotal() { // get de total
		return total;
	}


	public void setTotal(String total) { // set de total
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


	public int getPos() { // get de pos
		return pos;
	}


	public void setPos(int pos) { // set de pos
		this.pos = pos;
	}
}
