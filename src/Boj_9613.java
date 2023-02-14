import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_9613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            StringTokenizer str = new StringTokenizer(s);
            int n = Integer.parseInt(str.nextToken());
            int[] num = new int[n];
            for (int j = 0; j < n; j++) {
                num[j] = Integer.parseInt(str.nextToken());
            }
            long ans = 0;
            for (int j = 0; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    ans+=gcd(num[j], num[k]);
                }
            }
            System.out.println(ans);
        }
    }
    public static long gcd(int A, int B){
        int A1 = Math.max(A, B);
        int B1 = Math.min(A, B);
        while (true){
            if(A1%B1==0) break;
            int tmp = B1;
            B1 = A1%B1;
            A1 = tmp;
        }
        return B1;
    }
}
