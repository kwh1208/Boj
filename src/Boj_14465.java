import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_14465 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        StringTokenizer str1 = new StringTokenizer(s1);
        int n = Integer.parseInt(str1.nextToken());
        int k = Integer.parseInt(str1.nextToken());
        int b = Integer.parseInt(str1.nextToken());

        boolean[] light = new boolean[n+1];//전체길이의 신호등배열 생성, 고장난 신호등인 경우 true로 해줌.
        for (int i = 0; i < b; i++) {
            int tmp = Integer.parseInt(br.readLine());
            light[tmp-1] = true;
        }

        int s = 0;
        int e = k-1;//간격이 k로 고정.

        int ans = 0;
        for (int i = s; i <= e; i++) {//초기값 세팅. s~e까지 확인하면서 고장난 신호등 몇개인지 확인.
            if(light[i]) ans++;
        }
        int tmp = ans;
        while (e != n) {
            if (light[s]) tmp--;//s 옮기기전에 light 확인
            s++;
            e++;                   //s, e 같이 옮겨줌.
            if (light[e]) tmp++;//옮기고 나서 light 확인
            if (tmp < ans) ans = tmp;//고장난 개수 작은걸로 최신화.
        }
        System.out.println(ans);
    }
}
