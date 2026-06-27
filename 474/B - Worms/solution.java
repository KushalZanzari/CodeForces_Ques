import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prefix = new int[n];
        
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum += sc.nextInt();
            prefix[i] = currentSum;
        }
        
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int q = sc.nextInt();
            
            int left = 0, right = n - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (prefix[mid] >= q) {
                    right = mid; 
                } else {
                    left = mid + 1; 
                }
            }
            System.out.println(left + 1); 
        }
    }
}