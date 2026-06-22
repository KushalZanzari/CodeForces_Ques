import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int open = 0;
            int moves = 0;
            
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    open++;
                } else {
                    open--;
                }
                
                if (open < 0) {
                    moves++;
                    open = 0; 
                }
            }
            System.out.println(moves);
        }
    }
}