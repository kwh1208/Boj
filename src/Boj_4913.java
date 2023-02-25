import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class Boj_4913 {
    static boolean[] chk = new boolean[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        eratos();
        StringBuilder sb = new StringBuilder();
        while (true){
            StringTokenizer str = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(str.nextToken());
            int u = Integer.parseInt(str.nextToken());
            if(l==-1&&u==-1) {
                System.out.println(sb);break;}
            if(l<=0&&u<=0) sb.append(l+" "+u+" "+0+" "+0+"\n");
            else if (l <= 0&&u>0) {
                int cnt_total = 0;
                int cnt_fermat = 0;
                for (int i = 0; i <= u; i++) {
                    if(!chk[i]) {
                        cnt_total++;
                        if((i-1)%4==0||i==2) cnt_fermat++;
                    }
                }
                sb.append(l+" "+u+" "+cnt_total+" "+cnt_fermat+"\n");
            } else if (l > 0&&u>0) {
                int cnt_total = 0;
                int cnt_fermat = 0;
                for (int i = l; i <= u; i++) {
                    if(!chk[i]) {
                        cnt_total++;
                        if((i-1)%4==0||i==2) cnt_fermat++;
                    }
                }
                sb.append(l+" "+u+" "+cnt_total+" "+cnt_fermat+"\n");
            }
        }
    }
    public static void eratos(){
        for (int i = 2; i*i <= 1000000; i++) {
            if(chk[i]) continue;
            for (int j = i*i; j <= 1000000; j += i) {
                chk[j]=true;
            }
        }
        chk[0] = true;
        chk[1] = true;
    }
}
