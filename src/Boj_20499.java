import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_20499 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), "/");
        int k = Integer.parseInt(str.nextToken());
        int d = Integer.parseInt(str.nextToken());
        int a = Integer.parseInt(str.nextToken());
        if(k+a<d||d==0) System.out.println("hasu");
        else System.out.println("gosu");
    }
}
