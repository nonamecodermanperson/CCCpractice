import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            minDiff = Math.min(minDiff, A[i] - A[i - 1]);
        }
        System.out.println(minDiff);
    }
}
