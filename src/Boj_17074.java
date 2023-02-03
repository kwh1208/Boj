import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_17074 {
    public Boj_17074() {
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        String s = br.readLine();
        StringTokenizer str = new StringTokenizer(s);

        for(int i = 0; i < N; ++i) {
            num[i] = Integer.parseInt(str.nextToken());
        }

        int ans = 0;
        int chk = 0;

        for(int i = 1; i < N - 1; ++i) {
            if (num[i] < num[i - 1]) {
                ++chk;
                if (num[i] == num[i + 1]) {
                    ans = 1;
                } else {
                    ans = 2;
                }
            }
        }

        if (num[N - 1] < num[N - 2]) {
            ++chk;
            if (num[N - 3] > num[N - 1]) {
                ans = 1;
            } else {
                ans = 2;
            }
        }

        if (chk == 1) {
            System.out.println(ans);
        }

        if (chk == 0) {
            System.out.println(N);
        }

        if (chk >= 2) {
            System.out.println(0);
        }

    }
}
