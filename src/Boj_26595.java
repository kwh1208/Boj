import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_26595 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(str.nextToken());
        long p_a = Integer.parseInt(str.nextToken());
        long b = Integer.parseInt(str.nextToken());
        long p_b = Integer.parseInt(str.nextToken());

        long max = 0;
        long max_x = 0;
        long max_y = 0;

        long y = 0;

        for (int i = 0; i*p_a <= N; i++) {
            long price = N-(i*p_a);
            y = price/p_b;

            if(a*i+b*y>=max){
                max_x = i;
                max_y = y;
                max = a*i+b*y;
            }
        }
        System.out.println(max_x+" "+max_y);
    }

}