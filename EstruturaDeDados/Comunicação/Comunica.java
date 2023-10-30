package Principal;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Comunica {
	protected static Queue<String> userQueue = new LinkedList<>();
    protected static Queue<String> hostQueue = new LinkedList<>();
     
    public static void main(String[] args) {
    	Scanner s = new Scanner (System.in);

        User user = new User(userQueue, hostQueue);
        Host host = new Host(userQueue, hostQueue);

        Thread userThread = new Thread(user::start);
        Thread hostThread = new Thread(host::start);

        userThread.start();
        hostThread.start();
    }
}
