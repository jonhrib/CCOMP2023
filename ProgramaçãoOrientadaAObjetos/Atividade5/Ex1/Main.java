package Ex1;

public class Main {

	public static void main (String args []) {
		FiguraGeometrica f0 = new FiguraGeometrica(); 
		FiguraGeometrica f1 = new Circulo(); 
		FiguraGeometrica f2 = new Quadrado(); 
		FiguraGeometrica f3 = new Triangulo(); 
		FiguraGeometrica f4 = new TrianguloEquilatero(); 
		
		f0.desenha();
		f1.desenha();
		f2.desenha();
		f3.desenha();
		f4.desenha();
	}
}
