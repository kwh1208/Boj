import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj_28242 {
    /*
    * Acx^2 + (ad +bc) + bd = nx^2 + (n+1) x - (n+2)
Ac = n;
ad+ bc = n+1;
Bd = - (n+2) ;
    * */
    public static StringTokenizer st = null;

    public static BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

    public static int n;
    public static StringBuilder sb = new StringBuilder();

    public static boolean checkACBD(int a, int b) {
        int c = n / a;
        int d = -(n + 2) / b;
        if (a * d + b * c == n + 1) {
            sb.append(a).append(" ").append(b).append(" ").append(" ").append(c).append(" ").append(d).append("\n");
            return true;
        }
        return false;
    }


    public static ArrayList<Integer> factor = new ArrayList<>();
    public static ArrayList<Integer> factor2 = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        // 1. ac 정하기
        // 2. bc 정하기
        boolean flag = false;
        n = Integer.parseInt(br.readLine());
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                factor.add(i);
                factor.add(n / i);
            }
        }
        for (int i = 1; i * i <= n + 2; i++) {
            if ((n + 2) % i == 0) {
                factor2.add(i);
                factor2.add((n + 2) / i);
            }
        }

        loop:
        for (int i = 0; i < factor.size(); i++) {
            int a = factor.get(i);
            for (int j = 0; j < factor2.size(); j++) {
                int b = factor2.get(j);
                if (checkACBD(a, b)) {
                    flag = true;
                    break loop;
                }
            }
        }
        if (flag) System.out.println(sb);
        else System.out.println(-1);
    }
}