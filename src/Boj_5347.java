import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_5347 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            long a = Long.parseLong(str.nextToken());
            long b = Long.parseLong(str.nextToken());
            long lcm = a*b/gcd(a, b);
            System.out.println(lcm);
        }
    }
    public static long gcd(long A, long B){
        long A1 = Long.max(A, B);
        long B1 = Long.min(A, B);
        while (true){
            if(A1%B1==0) break;
            long tmp = B1;
            B1 = A1%B1;
            A1 = tmp;
        }
        return B1;
    }
}
