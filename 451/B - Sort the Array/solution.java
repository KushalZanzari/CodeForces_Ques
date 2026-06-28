import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        
        int l = 0, r = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                l = i;
                break;
            }
        }
        
        for (int i = n - 1; i > 0; i--) {
            if (a[i] < a[i - 1]) {
                r = i;
                break;
            }
        }
        
        for (int i = l, j = r; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        
        boolean sorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                sorted = false;
                break;
            }
        }
        
        if (sorted) {
            System.out.println("yes");
            System.out.println((l + 1) + " " + (r + 1));
        } else {
            System.out.println("no");
        }
    }
}