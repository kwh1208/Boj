package solved;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class Boj_20366 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int N = sc.nextInt();
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        int ans = Integer.MAX_VALUE;
  loop :for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                int anna = num[i]+num[j];
                int s = i+1;
                int e = N-1;
                while (true){
                    if(s==j) {s++;continue;}
                    if(e==j) {e--;continue;}
                    if(s==N-1||s>=e) {break;}
                    if(Math.abs(num[s]+num[e]-anna)<ans) {ans=Math.abs(num[s]+num[e]-anna);}
                    if(num[s]+num[e]==anna) {ans = 0; break loop;}
                    else if(num[s]+num[e]<anna) s++;
                    else if(num[s]+num[e]>anna) e--;
                }
            }
        }
        out.println(ans);
    }
}
