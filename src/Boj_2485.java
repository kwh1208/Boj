import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n+1];
        num[0] = Integer.parseInt(br.readLine());
        int gcd = 0;
        for (int i = 1; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            num[i] = tmp;
            if(gcd==0){
                gcd = num[1]-num[0];
            }
            gcd = gcd(gcd, num[i]-num[i-1]);
        }
        int length = num[n-1]-num[0];
        int treeNum = length/gcd;

        System.out.println(treeNum+1-n);

    }static int gcd(int a, int b){
        int a1 = Math.max(a,b);
        int b1 = Math.min(a,b);
        while (true){
            if(a1%b1==0) break;
            int tmp = b1;
            b1 = a1%b1;
            a1 = tmp;
        }
        return b1;
    }
}
