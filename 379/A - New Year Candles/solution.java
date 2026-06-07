import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int hours = a;
        int stubs = a;
        
        while (stubs >= b) {
            int newCandles = stubs / b;
            hours += newCandles;
            
            
            stubs = newCandles + (stubs % b);
        }
        
        System.out.println(hours);
    }
}