import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_17103 {
    static boolean chk[] = new boolean[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        eratos();
        for (int i = 0; i < t; i++) {
            int tmp = Integer.parseInt(br.readLine());
            int cnt = 0;
            for (int j = 2; j <= tmp/2; j++) {
                if(!chk[j]&&!chk[tmp-j]) cnt++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
    public static void eratos(){
        for (int i = 2; i*i <= 1000000; i++) {
            if(chk[i]) continue;
            for (int j = i*i; j <= 1000000; j += i) {
                chk[j]=true;
            }
        }
    }
}
