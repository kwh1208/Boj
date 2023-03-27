import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2961 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    static int[] sour;
    static int[] bitter;
    static long min_dif = Long.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        sour = new int[n];
        bitter = new int[n];
        StringTokenizer str;
        for (int i = 0; i < n; i++) {
             str = new StringTokenizer(br.readLine());
             sour[i] = Integer.parseInt(str.nextToken());
             bitter[i] = Integer.parseInt(str.nextToken());
        }
        cook(0, 1, 0, 0);
        System.out.println(min_dif);
    }
    public static void cook(int cnt, long final_sour, long final_bitter, int ingredients){
        if(cnt==n){
            long tmp = Math.abs(final_bitter-final_sour);
            if(ingredients!=0) min_dif = Math.min(tmp, min_dif);
            return;
        }
        cook(cnt+1, final_sour, final_bitter, ingredients);//미사용
        cook(cnt+1, final_sour*sour[cnt], final_bitter+bitter[cnt], ingredients+1);//사용
    }
}
