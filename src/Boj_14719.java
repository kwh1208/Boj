import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_14719 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        StringTokenizer str1 = new StringTokenizer(s1);
        int H = Integer.parseInt(str1.nextToken());
        int W = Integer.parseInt(str1.nextToken());
        int[] present = new int[W];
        String s2 = br.readLine();
        StringTokenizer str2 = new StringTokenizer(s2);

        for(int i = 0; i < W; ++i) {
            present[i] = Integer.parseInt(str2.nextToken());
        }
        
        int[] max_LR = new int[W];
        int[] max_RL = new int[W];
        max_LR[0] = present[0];

        int ans;
        for(ans = 1; ans < W; ++ans) {
            if (max_LR[ans - 1] < present[ans]) {
                max_LR[ans] = present[ans];
            } else {
                max_LR[ans] = max_LR[ans - 1];
            }
        }

        max_RL[W - 1] = present[W - 1];

        for(ans = W - 2; ans >= 0; --ans) {
            if (max_RL[ans + 1] < present[ans]) {
                max_RL[ans] = present[ans];
            } else {
                max_RL[ans] = max_RL[ans + 1];
            }
        }

        ans = 0;

        for(int i = 0; i < W; ++i) {
            int wall = Math.min(max_LR[i], max_RL[i]);
            if (wall > present[i]) {
                ans += wall - present[i];
            }
        }

        System.out.println(ans);
    }
}
