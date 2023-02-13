package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_22862 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        StringTokenizer str1 = new StringTokenizer(s1);
        int n = Integer.parseInt(str1.nextToken());
        int k = Integer.parseInt(str1.nextToken());
        int[] num = new int[n];
        String s2 = br.readLine();
        StringTokenizer str2 = new StringTokenizer(s2);
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(str2.nextToken());
            if(tmp%2==0) num[i] = 0;
            else num[i]=1;
        }
        int s = 0;
        int e = 0;
        int cnt = 0;
        if(num[0]==1) cnt++;
        int ans = e-s+1-cnt;
        while (true){
            if(e-s+1-cnt>ans&&cnt<=k) ans = e-s+1-cnt;
            if(e==n-1) break;
            if(cnt<=k) {
                e++;
                if(num[e]==1) cnt++;
            }
            if(cnt>k){
                if(num[s]==1) cnt--;
                s++;
            }
        }
        System.out.println(ans);
    }
}