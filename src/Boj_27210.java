import java.util.Arrays;
import java.util.Scanner;

public class Boj_27210 {
    static Scanner sc;
    static int N;
    static int[] stone;
    static int[] sum;

    public static void main(String[] args) {
        sum[0] = 0;

        int max;
        for(max = 0; max < N; ++max) {
            int tmp = sc.nextInt();
            if (tmp == 1) {
                stone[max] = 1;
            } else {
                stone[max] = -1;
            }
        }

        for(max = 1; max <= N; ++max) {
            sum[max] = sum[max - 1] + stone[max - 1];
        }

        Arrays.sort(sum);
        max = Math.abs(sum[N] - sum[0]);
        System.out.println(max);
    }

    static {
        sc = new Scanner(System.in);
        N = sc.nextInt();
        stone = new int[N];
        sum = new int[N + 1];
    }
}
