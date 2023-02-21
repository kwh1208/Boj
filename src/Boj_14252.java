import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_14252 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        StringTokenizer str = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(str.nextToken());
        }
        Arrays.sort(num);
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            if(gcd(num[i], num[i-1])!=1){
                cnt+=chk(num[i-1], num[i]);
            }
        }
        System.out.println(cnt);
    }
    public static int gcd(int x, int y){
        int x1 = Math.max(x, y);
        int y1 = Math.min(x, y);
        while (x1 % y1 != 0) {
            int tmp = y1;
            y1 = x1 % y1;
            x1 = tmp;
        }
        return y1;
    }
    public static int chk(int a, int b){
        for (int i = a+1; i < b; i++) {
            if(gcd(a, i)==1&&gcd(i, b)==1){
                return 1;}
        }
        return 2;
    }
}
