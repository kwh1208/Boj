import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str;
        str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());
        int k = Integer.parseInt(str.nextToken());

        int[] ice = new int[1000001];

        for (int i = 0; i < n; i++) {
            str = new StringTokenizer(br.readLine());
            int g = Integer.parseInt(str.nextToken());
            int x = Integer.parseInt(str.nextToken());
            ice[x] = g;
        }

        int max = 0;

        for (int i = 0; i <= 1+2*k&& i <= 1000000; i++) {
            max+=ice[i];
        }

        int tmp = max;
        int s = 0;
        int e = Math.min(1+2*k,1000000);
        while (true){
            if(e==1000000) break;
            tmp-=ice[s];
            s++;
            e++;
            tmp+=ice[e];

            if(tmp>max) {
                max = tmp;
            }

        }
        System.out.println(max);
    }
}