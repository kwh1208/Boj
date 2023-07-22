import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ABC311_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());
        int d = Integer.parseInt(str.nextToken());
        char[][] isFree = new char[n][d];

        String line;
        for (int i = 0; i < n; i++) {
            line = br.readLine();
            for (int j = 0; j < d; j++) {
                isFree[i][j] = line.charAt(j);
            }
        }
        int max = 0;
        int ans = 0;

        for (int i = 0; i < d; i++) {
            int chk = 0;
            for (int j = 0; j < n; j++) {
                if(isFree[j][i]=='o') chk++;
            }
            if(chk==n) ans++;
            else ans = 0;

            if(ans>max) max = ans;
        }
        System.out.println(max);
    }
}
