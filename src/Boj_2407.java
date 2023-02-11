import java.math.BigInteger;
import java.util.Scanner;

public class Boj_2407 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BigInteger ans = new BigInteger("1");
        for (double i = 1; i <= m; i++) {
            int tmp1 = (int) (n-i+1);
            BigInteger big_tmp1 = new BigInteger(String.valueOf(tmp1));
            int tmp2 = (int) (i);
            BigInteger big_tmp2 = new BigInteger(String.valueOf(tmp2));
            ans = ans.multiply(big_tmp1);
            ans = ans.divide(big_tmp2);
        }
        System.out.println(ans);
    }
}