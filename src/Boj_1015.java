import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_1015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] origin = new int[n];
        int[] sorted = new int[n];
        StringTokenizer str = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(str.nextToken());
            origin[i] = tmp;
            sorted[i] = tmp;
        }
        Arrays.sort(sorted);
        StringBuilder sb = new StringBuilder();
        for (Integer i : origin) {
            for (int j = 0; j < n; j++) {
                if(sorted[j]==i){
                    sb.append(j).append(" ");
                    sorted[j]=50000;
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
