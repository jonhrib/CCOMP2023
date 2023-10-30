package Principal;
import java.util.Queue;
import java.util.Scanner;

public class Host {
	
	private Queue<String> userQueue;
    private Queue<String> hostQueue;

    public Host(Queue<String> userQueue, Queue<String> hostQueue) {
        this.userQueue = userQueue;
        this.hostQueue = hostQueue;
    }

    public void start() {
        while (true) {
            if (!userQueue.isEmpty()) { // se não está vazia a pilha de mensagens do usuário
                String mensagem = userQueue.poll();
                System.out.println("Host: " + mensagem);
            }

            Scanner s = new Scanner(System.in);
            
            System.out.print("Host: ");
            String message = s.next();
            userQueue.add(message);
        }
    }
}
