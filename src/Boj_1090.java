import java.util.Arrays;
import java.util.Scanner;

public class Boj_1090 {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    public static void main(String[] args) {
        int[][] c = new int[n][2];
        for (int i = 0; i < n; i++) {
            c[i][0] = sc.nextInt();
            c[i][1] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(check(c,i)+" ");
        }
    }
    static int check(int[][] k, int i){
        int[][] target = new int[1][2];
        int min = 2147483647;
        int[] dif = new int[n];
        for (int x = 0;x<n;x++){
            target[0][0] = k[x][0];
            for (int j = 0; j < n; j++) {
                target[0][1] = k[j][1];
                for (int l = 0; l < n; l++) {
                    dif[l] = Math.abs(k[l][0]-target[0][0])+Math.abs(k[l][1]-target[0][1]);
                }
                Arrays.sort(dif);
                int sum = 0;
                for (int l = 0; l < i; l++) {
                    sum += dif[l];
                }
                if (min>sum) min = sum;
            }}
        return min;
    }
}