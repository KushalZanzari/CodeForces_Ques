import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int minMoves = (n + 1) / 2; 
        int maxMoves = n;
        int answer = -1;
        
        for (int i = minMoves; i <= maxMoves; i++) {
            if (i % m == 0) {
                answer = i;
                break;
            }
        }
        
        System.out.println(answer);
    }
}