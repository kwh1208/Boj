import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_15711 {
    static int[] prime = new int[148933];
    static boolean[] chk = new boolean[2000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        eratos();
        for (int i = 0; i < t; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            long a = Long.parseLong(str.nextToken());
            long b = Long.parseLong(str.nextToken());
            long sum = a+b;
            if(sum<4) sb.append("NO"+"\n");
            else if (sum % 2 == 0) {
                sb.append("YES"+"\n");
            }
            else {
                if(chk(sum-2)) sb.append("NO"+"\n");
                else sb.append("YES"+"\n");
            }
        }
        System.out.println(sb);
    }
    public static void eratos(){
        for (long i = 2; i <= 2000000; i++) {
            if(chk[(int)i]) continue;
            for (long j = i*i; j <= 2000000; j+=i) {
                chk[(int)j]=true;
            }
        }
        int tmp = 0;
        for (int i = 2; i < 2000000; i++) {
            if(!chk[i]) {
                prime[tmp]=i;
                tmp++;
            }
        }
    }
    public static boolean chk(long x){//합성수면 true 반환
        if(x<=2000000) return chk[(int)x];

        for (int i = 0; i < 148933; i++) {
                if(x%prime[i]==0) return true;
            }

        return false;
    }
}
