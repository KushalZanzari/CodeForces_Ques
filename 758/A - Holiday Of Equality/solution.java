import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) max = arr[i];
        }
        
        int cost = 0;
        for (int money : arr) {
            cost += (max - money);
        }
        System.out.println(cost);
    }
}