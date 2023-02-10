import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_22945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        String s1 = br.readLine();
        StringTokenizer str1 = new StringTokenizer(s1);
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(str1.nextToken());
        }
        long ans = 0;
        int s = 0;
        int e = n-1;
        while (true){
            if(s>=e) break;
            int dis = e-s-1;
            int tmp = dis*Math.min(num[s], num[e]);
            if(tmp>ans) ans=tmp;
            if(num[s]>=num[e]) e--;
            else s++;
        }
        System.out.println(ans);
    }
}
