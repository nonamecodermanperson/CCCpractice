import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        for (int i = 0; i <= n / 4; i++) {
            if ((n - 4 * i) % 5 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
