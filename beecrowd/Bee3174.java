import java.util.Scanner;

public class Bee3174 {
	
	public static void main (String args []) {
		Scanner s = new Scanner (System.in);
		int qtd = s.nextInt();
		int auxmusicos = 0, auxbonecos = 0, auxarquitetos = 0, auxdesenhistas = 0, brinquedos = 0;
		for (int i = 0; i < qtd; i++) {
			String nome = s.next();
			String grupo = s.next();
			int horas = s.nextInt();
			if (grupo.equalsIgnoreCase("bonecos")) {
				auxbonecos += horas;
			}
			if (grupo.equalsIgnoreCase("arquitetos")) {
				auxarquitetos += horas;
			}
			if (grupo.equalsIgnoreCase("musicos")) {
				auxmusicos += horas;
			}
			if (grupo.equalsIgnoreCase("desenhistas")) {
				auxdesenhistas += horas;
			}
		}
		brinquedos += (int) (Math.ceil(auxbonecos/8));
		brinquedos += (int) (Math.ceil(auxarquitetos/4));
		brinquedos += (int) (Math.ceil(auxmusicos/6));
		brinquedos += (int) (Math.ceil(auxdesenhistas/12));
		System.out.println (brinquedos);
	}
}