import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        boolean goldTeam = true;
        for (int i = 0; i < n; i++) {
            int points = sc.nextInt();
            int fouls = sc.nextInt();
            int rating = points * 5 - fouls * 3;
            if (rating > 40) {
                count++;
            } else {
                goldTeam = false;
            }
        }
        System.out.print(count);
        if (goldTeam) {
            System.out.print("+");
        }
    }
}
