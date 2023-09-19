package Ex01;
//Aluno: João Vitor de Souza Ribeiro 2ºAno - C.Comp

/* Dado o problema a seguir, abstraia possíveis classes (seus atributos e métodos) e dê
exemplos de pelo menos 1 objeto (instância) de cada classe. Não precisa escrever código
neste exercício.

 * “O coordenador do curso de graduação de Ciência da Computação contratou um analista
de sistemas para modelar um sistema que controle todos os projetos relacionados ao seu
curso. Os projetos a serem controlados se subdividem em dois grupos: projetos de iniciação
científica e projetos comerciais. Sabe-se que, cada projeto pode possuir vários estudantes,
mas somente um orientador. Os orientadores, por sua vez, podem orientar vários projetos,
ou seja, cada orientador pode possuir uma lista de projetos sob sua responsabilidade. Com
relação aos estudantes, esses podem participar de vários projetos. Para os projetos de
iniciação científica deseja-se armazenar: número, nome, data de início e área de pesquisa.
Já para os projetos comerciais, deseja-se guardar o número, nome, data de início, tempo
estimado de duração e custo estimado. Dos orientadores deseja-se guardar o número e o
nome. Para os estudantes, o número de matrícula e o nome. Para cada estudante que
participa de um projeto, deseja-se armazenar sua carga horária total de dedicação aos
projetos.” */

//Abaixo, a resolução do exercício proposto (Sem codigos funcionais)

/**************** POSSÍVEIS CLASSES ****************
 *
 * Classe 1. ProjetosCientificos()
 * --> Atributos:
 * 		- private int num (numero do projeto); 
 * 		- private String nome (nome do projeto);
 * 		- private String inicio (data de inicio do projeto - formato xx/xx/xxxx);
 * 		- private String area (area de pesquisa do projeto);
 * 		- private String Orientador (orientador do projeto);
 * 		- private String[] Aluno (aluno do projeto - implementado na Classe Aluno);
 * --> Métodos:
 * 		- public void setAluno() - (insere alunos no projeto);
 * 		- public String getAluno() - (mostra um aluno);
 * 		- public void removeAluno(String) - (remove determinado aluno do projeto);
 * 		- public void setOrientador() - (insere 1 (um) orientador ao projeto);
 * 		- public void trocaOrientador() - (modifica um orientador do projeto);
 * 		- public String getOrientador() - (mostra o orientador do projeto);
 * 		- public double getHoras() - (calcula a carga horária total de todos os estudantes somados);
 * 		- public void setArea() - (insere a área de pesquisa do projeto científico);
 * 		- public String getArea() - (mostra a área de pesquisa do projeto atualmente);
 * 		- public void setNum() - (recebe o número do projeto);
 * 		- public String getNum() - (mostra o número do projeto);
 * 		- public void setNome() - (recebe o nome do projeto - ou descrição - por exemplo);
 * 		- public String getNome() - (mostra o nome do projeto);
 * 		- demais métodos set e get dos atributos mencionados...
 *
 * Classe 2. ProjetosComerciais()
 * --> Atributos:
 * 		- private int num (numero do projeto);
 * 		- private String nome (nome do projeto);
 * 		- private String inicio (data de inicio do projeto - no mesmo formato citado anteriormente);
 * 		- private String area (area de pesquisa ou de mercado em que o projeto se relaciona);
 * 		- private String Orientador (orientador do projeto);
 * 		- private String[] Aluno (alunos do projeto - implementado pela Classe Aluno);
 * 		- private int tempoestimado (tempo estimado - em dias - do projeto);
 * 		- private double custoestimado (custo estimado para o projeto - em reais);
 * --> Métodos:
 * 		- public void setAluno() - (insere aluno no projeto);
 * 		- public String getAluno() - (mostra um aluno);
 * 		- public void removeAluno(String) - (remove determinado estudante do projeto);
 * 		- public String getArea() - (recebe a(s) área(s) referente ao projeto);
 * 		- * demais métodos get e set dos atributos mencionados acima (ou semelhantes a classe do projeto anterior) ...
 * 		- public trocaOrientador() - (modifica o orientador responsável pelo projeto);
 * 		- public void setTempo() - (determina o tempo estimado para a conclusão do projeto);
 * 		- public int getTempo() - (retorna o valor estipulado para o atributo tempoestimado);
 * 		- public void setCusto() - (determina o custo estimado para a execução do projeto);
 * 		- public double getCusto() - (retorna o custo final estimado do projeto);
 * 
 *  Classe 3. Estudante() ou Aluno()
 *  --> Atributos:
 *  	- private int carga (a carga horária total em que se dedicou aos projetos - qualquer tipo - em horas);
 *  	- private String nome (nome do estudante);
 *  	- private int [] numprojeto (numero do projeto ao qual o estudante pertence);
 *  	- private String email (email do estudante);
 *  	- private float matricula (número da matrícula do estudante - usando float para receber números de dimensões maiores, como por exemplo a matrícula da UNESPAR, no formato XXXXXXXXXXXXX -); 
 *  --> Métodos:
 *  	- o método para receber um novo aluno poderia ser implementado através da classe do projeto;
 *  	- public getprojetos() - (indica os números dos projetos que o estudante está matriculado);
 *  	- public addcarga() - (para adicionar nova carga horário ao total do aluno);
 *  	- public rename() - (para corrigir o nome do aluno ou adicionar um nome social, por exemplo);
 *  	- public newemail() - (para modificar o endereço de email registrado);
 *  	- public getAluno() - (retornaria para a classe do projeto as informações do aluno); 
 *  
 *  Classe 4. Orientador()
 *  --> Atributos:
 *  	- private int num (número do orientador);
 *  	- private email (email do orientador);
 *  	- private int [] numprojeto (projetos ao qual o orientador tem ligação);
 *  	- private nome (nome do orientador);
 *  --> Métodos:
 *  	- public rename() -  (para corrigir o nome do orientador);
 *  	- public getprojetos() - (mostra os números dos projetos orientados pelo orientador em questão);
 *  	- public newemail() - (para modificar o endereço de email atrelad ao orientador);
 *  	- public getOrientador() e setOrientador() - (o primeiro retorna para a classe do projeto as informações sobre o orientador e a segunda recebe, na classe do projeto, as informações de um novo orientador);
 *  
 ***************** 	EXEMPLOS ****************
 *
 * Na Classe 1. ProjetosCientificos()
 * 	--> num: 001;
 * 		nome: "A utilização da Inteligência Artificial nas diversas áreas ligadas à recuperação de mobilidade humana";
 * 		inicio: "15/08/2019";
 * 		area: "Inteligência Artificial e suas aplicações";
 * 		Orientador: *determinado pela classe Orientador();
 * 		Aluno[]: *determinados pela classe Estudante();
 * 
 * Na Classe 2. ProjetosComerciais()
 * 	--> num: 002;
 * 		nome: "Testes de qualidade e usabilidade de plataforma digital";
 * 		inicio: "27/02/2023";
 * 		area: "QA (Quality Assurance) e UX (User Experience)";
 * 		Orientador: *determinado pela classe Orientador();
 * 		Aluno[]: *determinado pela classe Estudante();
 * 		tempoestimado: 181; (dias)
 * 		custoestimado: 32.000; (reais)
 * 
 * Na Classe 3. Estudante()
 * 	--> nome: "Gustavo Albuquerque";
 * 		matricula: 1052018004004;
 * 		email: "gustavo.albuquerque@estudante.unespar.edu.br"; 
 *		carga: 56;
 * 		numprojetos[]: 001;
 * 
 *  --> nome: "Robson Jorgino";
 *	    matricula: 1022020001001;
 *	    email: "robson.jorgino.15@estudante.unespar.edu.br";
 *		carga: 112;
 *		numprojetos[]: 001, 002;
 *
 * Na Classe 4. Orientador()
 *  --> nome: "André Menezes da Silva";
 *  	num: 25698;
 *  	email: "andremenezes@ies.unespar.edu.br";
 *  	numprojetos[]: 001, 002;
 * 
 */

//Quaiquer dúvidas ou observações acerca deste exercício ou dos seguintes, estarei a total disposição via Google Classroom e/ou email (jonhvictor121@gmail.com);