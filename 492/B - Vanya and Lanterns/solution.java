import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        Arrays.sort(arr);
        
        int maxGap = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] > maxGap) {
                maxGap = arr[i] - arr[i - 1];
            }
        }
        double d = maxGap / 2.0;
        double startEdge = arr[0] - 0;
        double endEdge = l - arr[n - 1];
        
        System.out.println(Math.max(d, Math.max(startEdge, endEdge)));
    }
}