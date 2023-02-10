import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_22988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        StringTokenizer str1 = new StringTokenizer(s1);
        int n = Integer.parseInt(str1.nextToken());
        long X = Long.parseLong(str1.nextToken());
        long[] num = new long[n];
        String s2 = br.readLine();
        StringTokenizer str2 = new StringTokenizer(s2);
        for (int i = 0; i < n; i++) {
            num[i] = Long.parseLong(str2.nextToken());
        }
        Arrays.sort(num);
        long ans = 0;
        int s = 0;
        int end = 0;
        for (int i = n-1; i >= 0; i--) {
            if(num[i]==X) {ans++;n--;}
            else {end = i;break;}
        }
        while (true){
            if(s>=end) break;
            if(num[s]+num[end]>=(double)X/2.0) {ans++;n-=2;s++;end--;continue;}
            if(num[s]+num[end]<X) {s++;}
        }
        ans+=n/3;
        System.out.println(ans);
    }
}
