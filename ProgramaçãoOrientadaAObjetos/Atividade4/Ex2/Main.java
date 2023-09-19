package herança3;

public class Main {

	public static void main (String args []) {
		Animal a1 = new Animal ("Genérico");
		Ave ave1 = new Ave ("Ave Genérica");
		BemTeVi b1 = new BemTeVi ("Bem-Te-Vi Roberto");
		Papagaio p1 = new Papagaio ("Papagaio Lucas", "java é melhor que pascal");
		Cachorro cachorro = new Cachorro ("Cachorro Robson",15,true); // true para latido maiúsculo | false para latido minúsculo
		Cachorro cachorro2 = new Cachorro ("Cachorro Carlos",6,false);
		Vaca vaca = new Vaca ("Carla",6,true); // true permite ordenha | false não permite ordenha
		Vaca vaca2 = new Vaca ("Kelly",15,false);
		
		a1.imprime();
		System.out.println(a1.nome + " está dizendo: " + a1.falar());
		
		ave1.imprime();
		System.out.println(ave1.nome + " está dizendo: " + ave1.falar());
		
		b1.imprime();
		System.out.println(b1.nome + " está dizendo: " + b1.falar());
		b1.voar(5);
		
		p1.imprime();
		System.out.println(p1.nome + " está dizendo: " + p1.falar());
		p1.voar(8);
		
		cachorro.imprime();
		System.out.println(cachorro.nome + " está dizendo: " + cachorro.falar());
		cachorro.correr();
		
		vaca.imprime();
		System.out.println(vaca.nome + " está dizendo: " + vaca.falar());
		System.out.println("A vaca " + vaca.nome + " " + vaca.ordenhar());
		vaca.correr();
		
		cachorro2.imprime();
		System.out.println(cachorro2.nome + " está dizendo: " + cachorro2.falar());
		cachorro2.correr();
		
		vaca2.imprime();
		System.out.println(vaca2.nome + " está dizendo: " + vaca2.falar());
		System.out.println("A vaca " + vaca2.nome + " " + vaca2.ordenhar());
		vaca2.correr();
	}
}
