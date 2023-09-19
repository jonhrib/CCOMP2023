package principal2;

import herança2.*;

public class Main {
	
	public static void main (String args []) {
		Aluno al1 = new Aluno ("0062020005005","Jorge Aragão","11694260985","16/04/2005");
		ChefeDepartamento chefe1 = new ChefeDepartamento("Everton Luz","08511456975","24/08/1994","02564","21/02/2018",3986.23,"manuseio e avaliação de obras de arte","26/09/2022",1465.87);
		Funcionario fun1 = new Funcionario("Jorginho Roberto","12345678912","18/06/2001","02789","03/12/2022",1987.65);
		
		al1.mostrarAluno();
		System.out.println();
		fun1.mostrarFuncionario();
		System.out.println();
		chefe1.mostrarChefe();
	}
}
