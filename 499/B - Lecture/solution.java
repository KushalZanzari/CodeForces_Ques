import java.util.Scanner;
import java.util.HashMap;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 
        
        HashMap<String, String> dict = new HashMap<>();
        
        for (int i = 0; i < m; i++) {
            String wordA = sc.next();
            String wordB = sc.next();
            dict.put(wordA, wordB);
        }
        
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            String translated = dict.get(word);
            
            if (translated.length() < word.length()) {
                System.out.print(translated + " ");
            } else {
                System.out.print(word + " ");
            }
        }
    }
}