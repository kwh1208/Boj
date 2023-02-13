package solved;

import java.util.Scanner;

public class Boj_2737 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int num = sc.nextInt();
            long ans = 0;
            boolean sq = false;
            for (int j = 2; j*j <= num; j++) {
                if(num%j==0){
                    if(j%2==1) ans++;
                    if((num/j)%2==1) ans++;
                    if(num/j==j) sq=true;
                }
            }
            if(num%2==0) System.out.println(ans);
            else {
                if(sq) System.out.println(ans);
                else System.out.println((ans+1));
            }
        }
    }
}
