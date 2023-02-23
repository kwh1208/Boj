import java.util.Scanner;

public class Boj_23048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] color = new int[n+1];
        color[1] = 1;
        boolean[] chk = new boolean[n+1];//색칠되면 true
        int cnt = 1;
        for (long i = 2; i <= n; i++) {
            if(chk[(int)i]) continue;
            chk[(int)i]=true;
            cnt++;
            int clr = cnt;
            color[(int)i]=clr;
            for (long j = i*i; j <= n; j++) {
                if(j%i==0) {
                    chk[(int)j]=true;
                    color[(int)j]=clr;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cnt).append("\n");
        for (int i = 1; i <=n; i++) {
            sb.append(color[i]+" ");
        }
        System.out.println(sb);
    }
}
