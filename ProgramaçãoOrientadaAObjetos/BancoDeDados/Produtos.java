package banco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Produtos extends Conexão {
	private String nome;
	private int cod;
	private double valor;
	private int qtd;
	Scanner s = new Scanner (System.in);
	
	public Produtos() throws ClassNotFoundException, SQLException {
		
	}
	
	public Produtos(int cod, String nome, double valor, int qtd) throws ClassNotFoundException, SQLException {
		this.cod = cod;
		this.nome = nome;
		this.valor = valor;
		this.qtd = qtd;
	}
	
	public void inserir (String tipo) throws SQLException {
		if (tipo.equals("nacional")) {
			
			this.nome = "'" + nome + "'";
			
			double total = valor*qtd;
			
			String SQLInsert = "insert into produtonacional (cod,nome,valor,qtd,valortotal) VALUES (" + cod + "," + nome +"," + valor + "," + qtd + "," + total + ")";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(SQLInsert);	
		}
		else if (tipo.equals("internacional")) {
			
			this.nome = "'" + nome + "'";
			
			double total = valor*qtd;
			
			String SQLInsert = "insert into produtointernacional (cod,nome,valor,qtd,valortotal) VALUES (" + cod + "," + nome +"," + valor + "," + qtd + "," + total + ")";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(SQLInsert);	
		}
	}
	
	//Método para verificar se existem id's repetidos
	public boolean verificar (String tipo, int teste) throws SQLException {
		Statement stmt = con.createStatement();
		boolean result = false;
		
		if (tipo.equals("nacional")) {
			ResultSet dados = stmt.executeQuery("select cod, nome, valor, qtd, valortotal from produtonacional");
			if (dados.isBeforeFirst()) {
				
				while (dados.next()) {
					int id = Integer.parseInt(dados.getString(1));
					if (teste == id) {
						result = true;
						break;
					}
				}
			}
		}
		
		else if (tipo.equals("internacional")) {
			ResultSet dados = stmt.executeQuery("select cod, nome, valor, qtd, valortotal from produtointernacional");
			if (dados.isBeforeFirst()) {
				
				while (dados.next()) {
					int id = Integer.parseInt(dados.getString(1));
					if (teste == id) {
						result = true;
						break;
					}
				}
			}
		}
		
		else if (tipo.equals("nacional2")) {
			ResultSet dados = stmt.executeQuery("select cod, nome, valor, qtd, valortotal from produtonacional");
			if (dados.isBeforeFirst()) {
				
				while (dados.next()) {
					int id = Integer.parseInt(dados.getString(1));
					if (teste == id) {
						result = true;
						break;
					}
					else result = false;
				}
			}
		}
		
		else if (tipo.equals("internacional2")) {
			ResultSet dados = stmt.executeQuery("select cod, nome, valor, qtd, valortotal from produtointernacional");
			if (dados.isBeforeFirst()) {
				
				while (dados.next()) {
					int id = Integer.parseInt(dados.getString(1));
					if (teste == id) {
						result = true;
						break;
					}
					else result = false;
				}
			}
		}
		
		return result;
	}
	//Método para verificar se existem id's repetidos
	
	public void apagar (String tipo) throws SQLException {
		if (tipo.equals("nacional")) {
			System.out.println("Se deseja apagar um produto digite 1, se deseja apagar todos os produtos nacionais digite 2 "); 
			System.out.print("Opção escolhida: ");int escolha = s.nextInt();
			if (escolha == 1) {
				System.out.print("Informe o código do produto: "); int apaga = s.nextInt();
				String SQLInsert = "delete from produtonacional where cod = " + apaga;
				Statement stmt = con.createStatement();
				stmt.executeUpdate(SQLInsert);	
				System.out.println("Produto apagado com sucesso!!");
			}
			else if (escolha == 2) {
				String SQLInsert = "delete from produtonacional";
				Statement stmt = con.createStatement();
				stmt.executeUpdate(SQLInsert);	
				System.out.println("Produtos Nacionais apagados com sucesso!!");
			}
		}
		else if (tipo.equals("internacional")) {
			System.out.println("Se deseja apagar um produto digite 1, se deseja apagar todos os produtos internacionais digite 2 "); 
			System.out.print("Opção escolhida: ");int escolha = s.nextInt();
			if (escolha == 1) {
				System.out.print("Informe o código do produto: "); int apaga = s.nextInt();
				String SQLInsert = "delete from produtointernacional where cod = " + apaga;
				Statement stmt = con.createStatement();
				stmt.executeUpdate(SQLInsert);	
				System.out.println("Produto apagado com sucesso!!");
			}
			else if (escolha == 2) {
				String SQLInsert = "delete from produtointernacional";
				Statement stmt = con.createStatement();
				stmt.executeUpdate(SQLInsert);	
				System.out.println("Produtos Internacionais apagados com sucesso!!");
			}
		}
	}
	
	public void recuperar (String tipo) throws SQLException {
		DecimalFormat df = new DecimalFormat("0.00");
		Statement stmt = con.createStatement();
		
		if (tipo.equals("nacional")) {
			ResultSet dados = stmt.executeQuery("select cod, nome, valor, qtd, valortotal from produtonacional");
			
			if (dados.isBeforeFirst()) {
				System.out.println("------------- Produtos Nacionais ------------");
				
				while (dados.next()) {
					//System.out.println(dados.getRow());
					int id = Integer.parseInt(dados.getString(1));
					String nome = dados.getString(2);
					double valor = Double.parseDouble(dados.getString(3));
					double qtd = dados.getInt(4);
					double total = Double.parseDouble(dados.getString(5));
					
					System.out.println("Id: " + id + " | Nome: " + nome + " | Valor: " + df.format(valor) + " | Qtd: " + qtd + "| Valor Total: " +  df.format(total));
				}
				System.out.println("---------------------------------------------");
			}
			else System.out.println("Produtos Nacionais ainda não foram adicionados");
		}
		else if (tipo.equals("internacional")) {
			ResultSet dados = stmt.executeQuery("select cod, nome, valor, qtd, valortotal from produtointernacional");
			
			if (dados.isBeforeFirst()) {
				System.out.println("---------- Produtos Internacionais ----------");
				
				while (dados.next()) {
					//System.out.println(dados.getRow());
					int id = Integer.parseInt(dados.getString(1));
					String nome = dados.getString(2);
					double valor = Double.parseDouble(dados.getString(3));
					double qtd = dados.getInt(4);
					double total = Double.parseDouble(dados.getString(5));
					
					System.out.println("Id: " + id + " | Nome: " + nome + " | Valor: " + df.format(valor) + "| Qtd: " + qtd + "| Valor Total: " +  df.format(total));
				}
				System.out.println("---------------------------------------------");
			}
			else System.out.println("Produtos Internacionais ainda não foram adicionados");
		}
	}
	
	public void atualizar (String tipo) throws SQLException {
		if (tipo.equals("nacional")) {
			System.out.print("Informe o código do produto que dejesa editar: "); int edita = s.nextInt();
			if (verificar("nacional",edita)) {
				System.out.print("Insira o campo que deseja editar (1 para Nome | 2 para Valor): "); int altera = s.nextInt();
				if (altera == 1) {
					s.nextLine();
					System.out.print("O novo nome do produto: "); String conteudo = s.nextLine();
					conteudo = "'" + conteudo + "'";
					String SQLInsert = "update produtonacional set nome = " + conteudo + " where cod = " + edita;
					Statement stmt = con.createStatement();
					stmt.executeUpdate(SQLInsert);
				}
				else if (altera == 2) {
					System.out.print("O novo valor do produto: "); double conteudo = s.nextDouble();
					String SQLInsert = "update produtonacional set valor = " + conteudo + " where cod = " + edita;
					Statement stmt = con.createStatement();
					stmt.executeUpdate(SQLInsert);
					
					ResultSet dados = stmt.executeQuery("select cod, nome, valor, qtd, valortotal from produtonacional");
					while (dados.next()) {
						if (dados.getInt(1) == edita) {
							qtd = dados.getInt(4);
							break;
						}
					}
					double totalaux = conteudo*qtd;
					SQLInsert = "update produtonacional set valortotal = " + totalaux + " where cod = " + edita; 
					stmt = con.createStatement();
					stmt.executeUpdate(SQLInsert);	
				}	
			}
			else System.out.println("O código fornecido não está cadastrado");
		}
		else if (tipo.equals("internacional")) {
			System.out.print("Informe o código do produto que dejesa editar: "); int edita = s.nextInt();
			if (verificar("internacional",edita)) {
				System.out.print("Insira o campo que deseja editar (1 para Nome | 2 para Valor): "); int altera = s.nextInt();
				if (altera == 1) {
					s.nextLine();
					System.out.print("O novo nome do produto: "); String conteudo = s.nextLine();
					conteudo = "'" + conteudo + "'";
					String SQLInsert = "update produtointernacional set nome = " + conteudo + " where cod = " + edita;
					Statement stmt = con.createStatement();
					stmt.executeUpdate(SQLInsert);	
				}
				else if (altera == 2) {
					System.out.print("O novo valor do produto: "); double conteudo = s.nextDouble();
					String SQLInsert = "update produtointernacional set valor = " + conteudo + " where cod = " + edita;
					Statement stmt = con.createStatement();
					stmt.executeUpdate(SQLInsert);
					ResultSet dados = stmt.executeQuery("select cod, nome, valor, qtd, valortotal from produtointernacional");
					while (dados.next()) {
						if (dados.getInt(1) == edita) {
							qtd = dados.getInt(4);
							break;
						}
					}
					double totalaux = conteudo*qtd;
					SQLInsert = "update produtointernacional set valortotal = " + totalaux + " where cod = " + edita; 
					stmt = con.createStatement();
					stmt.executeUpdate(SQLInsert);	
				}
			}
			else System.out.println("O código fornecido não está cadastrado");
		}
	}
	
	public void atualizarVini (String tipo) throws SQLException {
		Statement stmt = con.createStatement();
		
		if (tipo.equals("nacional")) {
			System.out.print("Informe a linha do produto que dejesa editar: "); int edita = s.nextInt();
			ResultSet dados = stmt.executeQuery("select cod, nome, valor, qtd, valortotal from produtointernacional");
			if (dados.isBeforeFirst()) { // se existirem dados
				while (dados.next()) {
					int linha = dados.getRow();
					if (linha == edita) {
						int id = Integer.parseInt(dados.getString(1));
						if (verificar("nacional",edita)) {
							System.out.print("Insira o campo que deseja editar (1 para Nome | 2 para Valor): "); int altera = s.nextInt();
							if (altera == 1) {
								s.nextLine();
								System.out.print("O novo nome do produto: "); String conteudo = s.nextLine();
								conteudo = "'" + conteudo + "'";
								String SQLInsert = "update produtonacional set nome = " + conteudo + " where cod = " + edita;
								stmt = con.createStatement();
								stmt.executeUpdate(SQLInsert);	
							}
							else if (altera == 2) {
								System.out.print("O novo valor do produto: "); double conteudo = s.nextDouble();
								String SQLInsert = "update produtointernacional set nome = " + conteudo + " where cod = " + edita;
								stmt = con.createStatement();
								stmt.executeUpdate(SQLInsert);	
							}	
						}
						else System.out.println("O código fornecido não está cadastrado");
					}
				}
			}
		}
	}
}
