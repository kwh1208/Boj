package solved;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class Boj_27210 {
    static Scanner sc = new Scanner(in);
    static int N = sc.nextInt();
    static int[] stone = new int[N];
    static int sum[] =  new int[N+1];

    public static void main(String[] args) {
        sum[0] = 0;
        for (int i = 0; i < N; i++) {
            int tmp = sc.nextInt();
            if(tmp==1) stone[i] = 1;
            else stone[i] = -1;
        }

        for (int i = 1; i <= N; i++) {
            sum[i] = sum[i-1]+stone[i-1];
        }
        Arrays.sort(sum);
        int max = Math.abs(sum[N]-sum[0]);
        out.println(max);
    }
}
