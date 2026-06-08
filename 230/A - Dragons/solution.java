import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); 
        int n = sc.nextInt(); 
        
        
        int[][] dragons = new int[n][2];
        for (int i = 0; i < n; i++) {
            dragons[i][0] = sc.nextInt();
            dragons[i][1] = sc.nextInt();
        }
        
        
        Arrays.sort(dragons, Comparator.comparingInt(a -> a[0]));
        
        boolean win = true;
        for (int i = 0; i < n; i++) {
            if (s > dragons[i][0]) {
                s += dragons[i][1]; 
            } else {
                win = false; 
                break;
            }
        }
        
        if (win) System.out.println("YES");
        else System.out.println("NO");
    }
}