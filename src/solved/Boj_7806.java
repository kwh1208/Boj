package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.System.*;


public class Boj_7806{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String s;
        while ((s = br.readLine())!=null){
            StringTokenizer st = new StringTokenizer(s);
            if(!st.hasMoreElements()) break;
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            //k 소인수분해
            int[][] fac = factorization(k);
            int ans = 1;
            for (int i = 0; i < 50; i++) {
                int tmp = n;
                int cnt = 0;
                if(fac[i][0]==0) break;
                while (true){
                    if(tmp/fac[i][0]!=0) {cnt+=tmp/fac[i][0];tmp/=fac[i][0];}
                    else break;
                }
                if(cnt!=0) ans*=Math.pow(fac[i][0], Math.min(fac[i][1], cnt));
            }
            out.println(ans);}
    }
    public static int[][] factorization(int x){
        int[][] fac = new int[50][2];
        int tmp =0;
        for (int i = 2; i*i <= x; i++) {
            int cnt = 0;
            while (true){
                if(x%i==0) {cnt++;x/=i;}
                else break;
            }
            if(cnt!=0) {fac[tmp][0]=i;fac[tmp][1]=cnt;tmp++;}
        }
        if(x!=1) {fac[tmp][0] = x;fac[tmp][1] = 1;}
        return fac;
    }
}