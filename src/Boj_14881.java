import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_14881 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            long a = Long.parseLong(str.nextToken());
            long b = Long.parseLong(str.nextToken());
            long c = Long.parseLong(str.nextToken());
            long gcd = gcd(a, b);
            if(c<=Math.max(a, b)&&(c%gcd)==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static long gcd(long A, long B){//A가 큰거, B가 작은거.if(B==0) return A;
        while (true){
            if(A%B==0) break;
            long tmp = B;
            B=A%B;
            A=tmp;
        }
        return B;
    }
}
