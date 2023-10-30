package Principal;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
    	Scanner s = new Scanner (System.in);
    	
    	Titulo(" Resolução de Expressões Aritméticas ","-");
        System.out.print("Digite a expressão que deseja resolver, sem espaços: ");
        String conta = s.next();
        Node raiz = construtor(conta);
        Titulo(" Gerando resultado ",".");

        int result = calcula(raiz);
        System.out.println("Resultado: " + result);
        
        Titulo ("",".");
    }
	
    public static int calcula(Node raiz) {
        if (raiz == null) {
        	return 0; // se raiz é nula retorno 0
        }

        else if (raiz.left == null && raiz.right == null) { // se raiz é uma folha (1 número só)
        	return Character.getNumericValue(raiz.dado); // se a raiz não tiver filhos, nem a esquerda nem a direita, ele é um número, retornamos o valor contido na raiz
        }
        
        else { // se a raiz não é uma folha
        	int leftValue = calcula(raiz.left); // calcula-se o filho esquerdo
            int rightValue = calcula(raiz.right); // calcula-se o filho a direita

            switch (raiz.dado) { // verifica qual operação devemos realizar
                case '+':
                    return leftValue + rightValue; // soma
                case '-':
                    return leftValue - rightValue; //redução
                case '*':
                    return leftValue * rightValue; //multiplicação
                case '/':
                    if (rightValue == 0) { //divisão
                        throw new ArithmeticException("Divisão por zero"); //excessão para quando a divisão for por zero
                    }
                    return leftValue / rightValue;
            }
            return 0;
        }
    }

    public static Node construtor(String conta) {
        Stack<Node> nós = new Stack<>(); //cria uma pilha de Nodes
        Stack<Character> operadores = new Stack<>(); // uma pilha de char

        for (int i = 0; i < conta.length(); i++) { // percorre os caracteres da String conta
            char c = conta.charAt(i); // o caracter da vez

            if (Character.isDigit(c)) { // se o caractere for um dígito (número)
                nós.push(new Node(c)); // cria um nó e coloca na pilha
            } 
            
            else if (c == '(') { 
                operadores.push(c);
            } 
            
            else if (c == ')') {
                while (!operadores.isEmpty() && operadores.peek() != '(') {
                    char operator = operadores.pop();
                    Node right = nós.pop();
                    Node left = nós.pop();
                    Node newNode = new Node(operator);
                    newNode.left = left;
                    newNode.right = right;
                    nós.push(newNode);
                }
                operadores.pop(); // Remove '('
            } 
            
            else {
                while (!operadores.isEmpty() && precedencia(operadores.peek()) >= precedencia(c)) {
                    char operator = operadores.pop();
                    Node right = nós.pop();
                    Node left = nós.pop();
                    Node newNode = new Node(operator);
                    newNode.left = left;
                    newNode.right = right;
                    nós.push(newNode);
                }
                operadores.push(c);
            }
            
        }

        while (!operadores.isEmpty()) {
            char operator = operadores.pop();
            Node right = nós.pop();
            Node left = nós.pop();
            Node newNode = new Node(operator);
            newNode.left = left;
            newNode.right = right;
            nós.push(newNode);
        }

        return nós.pop();
    }

    public static int precedencia(char operator) { // * e / são executados antes
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2; // prioridade maior
            default:
                return 0;
        }
    }
    
    public static void Titulo (String texto, String tipo) { // função que imprime um "cabeçalho"
		for (int i = 0; i < ((90-texto.length())/2); i++) {
			System.out.print(tipo); 
		}
		System.out.print(texto);  //imprime o conteúdo recebido por parâmetro, entre cadeias de do texto escolhido, intitulado tipo
		for (int i = 0; i < ((90-texto.length())/2); i++) {
			System.out.print(tipo);
		}
		 System.out.println();
	}
}
