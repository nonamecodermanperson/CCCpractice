import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int totalCost = 0;
        for (int i = 0; i < N; i++) {
            int cost = Integer.parseInt(br.readLine());
            if (cost >= M) {
                totalCost += cost - K;
            } else {
                totalCost += cost;
            }
        }
        System.out.println(totalCost);
    }
}
