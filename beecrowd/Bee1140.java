import java.util.Scanner;

public class Bee1140 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String sentence = scanner.nextLine();
            
            if (sentence.equals("*")) {
                break;
            }
            
            boolean isTautogram = checkTautogram(sentence);
            
            if (isTautogram) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
        
        scanner.close();
    }
    
    public static boolean checkTautogram(String sentence) {
        String[] words = sentence.split(" ");
        
        char firstLetter = Character.toLowerCase(words[0].charAt(0));
        
        for (String word : words) {
            char letter = Character.toLowerCase(word.charAt(0));
            
            if (letter != firstLetter) {
                return false;
            }
        }
        
        return true;
    }
}
