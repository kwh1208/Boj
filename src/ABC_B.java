import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ABC_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());
        int[] scores = new int[5*n];
        for (int i = 0; i < 5 * n; i++) {
            scores[i] = Integer.parseInt(str.nextToken());
        }
        Arrays.sort(scores);
        double total = 0;
        for (int i = 0; i < n; i++) {
            scores[i]=0;
            scores[5*n-1-i]=0;
        }
        for (int i = 0; i < 5*n; i++) {
            total+=scores[i];
        }
        System.out.println(total/(3*n));
    }
}
