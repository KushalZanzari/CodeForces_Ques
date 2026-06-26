import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int allSingles = n * a;
        int allBundles = ((n + m - 1) / m) * b; 
        int mixed = (n / m) * b + (n % m) * a;
        
        System.out.println(Math.min(allSingles, Math.min(allBundles, mixed)));
    }
}