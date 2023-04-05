import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Boj_1247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BigInteger zero = new BigInteger("0");
        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(br.readLine());
            BigInteger total = new BigInteger("0");
            for (int j = 0; j < n; j++) {
                long tmp = Long.parseLong(br.readLine());
                total=total.add(BigInteger.valueOf(tmp));
            }
            if(total.compareTo(zero)==-1){
                sb.append("-").append("\n");
            } else if (total.compareTo(zero)==1) {
                sb.append("+").append("\n");
            }
            else sb.append("0").append("\n");
        }
        System.out.println(sb);
    }
}
