import java.util.Scanner;

public class Boj_2986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long ans = 0;
        for (long i = 2; i*i <= n; i++) {
            if(n%i==0) {ans=i;break;}
        }
        if(ans!=0) {
            ans=n-n/ans;
            System.out.println(ans);
        }
        else System.out.println(n-1);
    }
}
