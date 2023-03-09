import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashSet;

public class Boj_1235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] num = new String[n];
        for (int i = 0; i < n; i++) {
            num[i] = br.readLine();
        }
        int len = num[0].length();
        for (int i = 1; i <= len; i++) {
            HashSet<BigInteger> hs = new HashSet<>();
            for (int j = 0; j < n; j++) {
                BigInteger tmp = new BigInteger(num[j]);
                hs.add(tmp.remainder(BigInteger.valueOf((int)Math.pow(10,i))));
            }
            if(hs.size()==n) {System.out.println(i);break;}
        }
    }
}