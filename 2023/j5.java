import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int totalCost = 0;
        for (int i = 0; i < N; i++) {
            int cost = sc.nextInt();
            if (cost >= M) {
                totalCost += cost - K;
            } else {
                totalCost += cost;
            }
        }
        System.out.println(totalCost);
    }
}
