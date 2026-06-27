import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        int evens = 0, odds = 0;
        int lastEven = -1, lastOdd = -1;
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                evens++;
                lastEven = i + 1;
            } else {
                odds++;
                lastOdd = i + 1;
            }
        }
        
        if (evens == 1) {
            System.out.println(lastEven);
        } else {
            System.out.println(lastOdd);
        }
    }
}