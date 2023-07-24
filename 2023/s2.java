import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <= N; i++) {
            int minAsymmetry = Integer.MAX_VALUE;
            for (int j = 0; j <= N - i; j++) {
                int asymmetry = 0;
                for (int k = 0; k < i / 2; k++) {
                    asymmetry += Math.abs(h[j + k] - h[j + i - k - 1]);
                }
                minAsymmetry = Math.min(minAsymmetry, asymmetry);
            }
            System.out.print(minAsymmetry + " ");
        }
    }
}
