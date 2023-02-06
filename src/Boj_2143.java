import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

import static java.lang.System.*;

public class Boj_2143 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int T = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int[] sum_A = new int[A+1];
        HashMap<Long, Long> hmA = new HashMap<>();
        String s1 = br.readLine();
        StringTokenizer str1 = new StringTokenizer(s1);
        for (int i = 1; i <= A; i++) {
            int tmp = Integer.parseInt(str1.nextToken());
            sum_A[i] = sum_A[i-1]+tmp;
        }
        for (int i = 1; i <= A; i++) {
            for (int j = 0; j < i; j++) {
                long tmp = sum_A[i]-sum_A[j];
                if(hmA.containsKey(tmp)){
                    hmA.replace(tmp, hmA.get(tmp)+1);
                }
                else hmA.put(tmp, 1L);
            }
        }
        int B = Integer.parseInt(br.readLine());
        int[] sum_B = new int[B+1];
        HashMap<Long, Long> hmB = new HashMap<>();
        String s2 = br.readLine();
        StringTokenizer str2 = new StringTokenizer(s2);
        for (int i = 1; i <= B; i++) {
            int tmp1 = Integer.parseInt(str2.nextToken());
            sum_B[i] = sum_B[i-1]+tmp1;
        }
        for (int i = 1; i <= B; i++) {
            for (int j = 0; j < i; j++) {
                long tmp = sum_B[i]-sum_B[j];
                if(hmB.containsKey(tmp)){
                    hmB.replace(tmp, hmB.get(tmp)+1);
                }
                else hmB.put(tmp, 1L);
            }
        }
        long ans = 0;
        for (Long i : hmA.keySet()) {
            if(hmB.containsKey(T-i)) ans+=((long) hmA.get(i) *hmB.get(T-i));
        }
        out.println(ans);
    }
}
