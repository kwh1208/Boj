import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_2473 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] acid = new long[n];
        StringTokenizer str = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            acid[i] = Integer.parseInt(str.nextToken());
        }
        Arrays.sort(acid);
        int[] ans = new int[3];
        long chk = Long.MAX_VALUE;
  loop: for (int i = 0; i < n; i++) {
            int s = 0;
            int e = n-1;
            while (true){
                if(s>=e) break;
                if(s==i) {s++;continue;}
                if(e==i) {e--;continue;}
                long sum = acid[i]+acid[s]+acid[e];
                if(Math.abs(sum)<Math.abs(chk)) {ans[0] = i;ans[1] = s;ans[2]=e; chk = sum;}
                if(sum==0) {ans[0] = i;ans[1] = s;ans[2]=e; break loop;}
                if(sum<0) {s++;}
                else e--;
            }
        }
        Arrays.sort(ans);
        for (int i = 0; i < 3; i++) {
            System.out.print(acid[ans[i]]+" ");
        }
    }
}
