package Ex1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
//import java.util.Scanner;

public class Principal {

	public static void main (String args []) {
		Aluno al1 = new Aluno ("0001","Jorginho Alberto","(43) 99999-9999","Rua dos Alfeneiros");
		Aluno al2 = new Aluno ("0002","Roberto Cassani","(43) 88888-8888","Rua dos Jamantos");
		Aluno al3 = new Aluno ("0003","Lucyana Fernanda","(43) 66666-6666","Rua Ferdinando");
		Aluno al4 = new Aluno ("0004","Carmen Miranda","(43) 77777-7777","Rua dos Abacaxis");
		Aluno al5 = new Aluno ("0005","Jorge Filho","(43) 97999-9899","Rua dos Netos");
		
		// ArrayList
		
		System.out.println("IMPRESSÃO ARRAYLIST");
		System.out.println();
		
		ArrayList <Aluno> alunos = new ArrayList();
		alunos.add(al1);
		alunos.add(al2);
		alunos.add(al3);
		alunos.add(al4);
		alunos.add(al3);
		alunos.add(al5);
		
		for (int i = 0; i < alunos.size(); i++) { // imprimindo de maneira comum
			alunos.get(i).ImprimeDados();	//alunos.get(i) pega o índice no Array List
		}
		
		System.out.println();
		
		// HashSet
		
		System.out.println("IMPRESSÃO HASHSET");
		
		/*Set <Aluno> alunos1 = new HashSet<>();
		alunos1.add(al1);
		alunos1.add(al2);
		alunos1.add(al3);
		alunos1.add(al4);                  //HashSet do tipo Aluno, recebendo todos os dados do tipo
		alunos1.add(al5);
		
		Iterator <Aluno> i = alunos1.iterator();
		while (i.hasNext()) {
			Aluno aux = i.next();
			aux.ImprimeDados();
		}*/
		
		Set <String> alunos1 = new HashSet<>();
		alunos1.add(al1.getNome());
		alunos1.add(al2.getNome());
		alunos1.add(al3.getNome());
		alunos1.add(al4.getNome());      //HashSet do tipo String, apenas recebendo o nome de cada Aluno
		alunos1.add(al5.getNome());
		
		boolean aux1 = alunos1.contains(al1.getNome());
		System.out.println(aux1);
		aux1 = alunos1.contains("Jorge");
		System.out.println(aux1);
		
		Iterator <String> i = alunos1.iterator();
		int cont = 0;
		while (i.hasNext()) {
			cont++;
			String aux = i.next(); //.next() resgata um elemento
			System.out.println("O nome do Aluno " + cont + " é " + aux);
		}
		
		System.out.println();
		// HashMap
		
		System.out.println("IMPRESSÃO HASHMAP");
		
		Map <String,Aluno> alunos2 = new HashMap<>();
		
		alunos2.put("Chave1",al1);
		alunos2.put("Chave2",al2);
		alunos2.put("Chave3",al3);
		alunos2.put("Chave4",al3);
		alunos2.put("Chave5",al4);
		alunos2.put("Chave6",al4);
		alunos2.put("Chave7",al5);
		
		for (String chave: alunos2.keySet()) { // chama-se for it
			System.out.println(chave + ": ");alunos2.get(chave).ImprimeDados(); //get(chave) passa a chave como um "índice"
		}
		
		/*Scanner s = new Scanner (System.in);
		System.out.println("A chave que deseja encontrar as informações: ");
		String chaveaux = s.next();
		System.out.println(chaveaux + ": ");alunos2.get(chaveaux).ImprimeDados();*/
	}
}
