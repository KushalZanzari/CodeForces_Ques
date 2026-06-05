import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        
        if (t == 10) {
            if (n == 1) {
                System.out.println("-1");
            } else {
                System.out.print("1");
                for (int i = 1; i < n; i++) System.out.print("0");
                System.out.println();
            }
        } else {
            // Simply print t 'n' times
            for (int i = 0; i < n; i++) {
                System.out.print(t);
            }
            System.out.println();
        }
    }
}