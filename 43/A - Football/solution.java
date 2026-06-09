import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String team1 = sc.next();
        int score1 = 1;
        String team2 = "";
        int score2 = 0;
        
        for (int i = 1; i < n; i++) {
            String current = sc.next();
            if (current.equals(team1)) {
                score1++;
            } else {
                team2 = current;
                score2++;
            }
        }
        
        if (score1 > score2) {
            System.out.println(team1);
        } else {
            System.out.println(team2);
        }
    }
}