import java.util.Scanner;

public class Bee2808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Leitura da posição inicial e destino
        String posInicial = sc.next();
        String posDestino = sc.next();
        
        // Converte as posições para coordenadas numéricas
        int colunaInicial = posInicial.charAt(0) - 'a' + 1;
        int linhaInicial = Character.getNumericValue(posInicial.charAt(1));
        int colunaDestino = posDestino.charAt(0) - 'a' + 1;
        int linhaDestino = Character.getNumericValue(posDestino.charAt(1));
        
        // Calcula a diferença entre as coordenadas
        int difColuna = Math.abs(colunaDestino - colunaInicial);
        int difLinha = Math.abs(linhaDestino - linhaInicial);
        
        // Verifica se o movimento é válido para um cavalo
        boolean movimentoValido = (difColuna == 2 && difLinha == 1) || (difColuna == 1 && difLinha == 2);
        
        // Imprime o resultado
        if (movimentoValido) {
            System.out.println("VALIDO");
        } else {
            System.out.println("INVALIDO");
        }
        
        sc.close();
    }
}

