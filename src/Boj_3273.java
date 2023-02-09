import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.System.*;

public class Boj_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        String s1 = br.readLine();
        StringTokenizer str = new StringTokenizer(s1);
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(str.nextToken());
        }
        Arrays.sort(num);
        long ans = 0;
        int x = Integer.parseInt(br.readLine());
        int s = 0;
        int e = n-1;
        while (s != e) {
            if (num[s] + num[e] == x) {
                ans++;
                s++;
                continue;
            }
            if (num[s] + num[e] < x) {
                s++;
                continue;
            }
            if (num[s] + num[e] > x) {
                e--;
            }
        }
        out.println(ans);
    }
}
