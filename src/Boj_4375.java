import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Boj_4375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine())!=null){
            BigInteger integer = new BigInteger("1");
            BigInteger n = new BigInteger(line);
            BigInteger ten = new BigInteger("10");
            BigInteger one = new BigInteger("1");
            int ans = 1;
            while (true){
                if(!integer.mod(n).equals(new BigInteger("0"))){
                    ans++;
                    integer = integer.multiply(ten);
                    integer = integer.add(one);
                }
                else break;
            }
            System.out.println(ans);
        }
    }
}
