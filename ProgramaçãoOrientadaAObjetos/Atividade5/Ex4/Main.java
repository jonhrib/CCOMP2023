package Ex4;

public class Main {

	public static void main (String args []) {
		
		AlunoMestrado al1 = new AlunoMestrado(0001,"Alberto Cossani","43 999999999","Rua Valheiros, 46", 1234, 60, 13, 'A', 68);
		AlunoMestrado al2 = new AlunoMestrado(0002,"Suzanne Robert","43 988888888","Rua Castilapo, 567", 5678, 60, 8, 'B', 60);
		Funcionário fun1 = new Funcionário(003,"Marcia Gasparino","43 977777777","Rua Pardal, 21", 2456.78);
		
		al1.imprimeDados();
		if (al1.aprovado())System.out.println("Resultado Final: ALUNO APROVADO"); else System.out.println("Resultado Final: ALUNO REPROVADO");
		System.out.println("---------------------------------------------------------");
		al2.imprimeDados();
		if (al2.aprovado())System.out.println("Resultado Final: ALUNO APROVADO"); else System.out.println("Resultado Final: ALUNO REPROVADO");
		System.out.println("---------------------------------------------------------");
		fun1.imprimeDados();
	}

}
