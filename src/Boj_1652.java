import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Boj_1652 {
    static char[][] room;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String s;
        room = new char[n][n];
        for (int i = 0; i < n; i++) {
             s = br.readLine();
            for (int j = 0; j < n; j++) {
                room[i][j] = s.charAt(j);
            }
        }
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < n; i++) {
            max1+=chk_row(i);
            max2+=chk_col(i);
        }
        System.out.print(max2+" "+max1);
    }
    public static int chk_row(int x){
        int ans = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if(room[i][x]=='.') cnt++;
            else {
                if(cnt>=2) ans++;
                cnt=0;
            }
        }
        if(cnt>=2) ans++;
        return ans;
    }
    public static int chk_col(int x){
        int ans = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if(room[x][i]=='.') cnt++;
            else {
                if(cnt>=2) ans++;
                cnt=0;
            }
        }
        if(cnt>=2) ans++;
        return ans;
    }
}
