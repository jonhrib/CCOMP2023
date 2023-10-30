package Principal;
import java.util.Queue;
import java.util.Scanner;

public class User {
	private Queue<String> userQueue;
    private Queue<String> hostQueue;

    public User(Queue<String> userQueue, Queue<String> hostQueue) {
        this.userQueue = userQueue;
        this.hostQueue = hostQueue;
    }

    public void start() {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Usuário: ");
            String mensagem = s.next();
            hostQueue.add(mensagem);
        }
    }
}
