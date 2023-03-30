import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1487 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] buy_price = new int[n];
        int[] order_price = new int[n];
        StringTokenizer str;
        for (int i = 0; i < n; i++) {
            str = new StringTokenizer(br.readLine());
            buy_price[i] = Integer.parseInt(str.nextToken());
            order_price[i] = Integer.parseInt(str.nextToken());
        }
        int max = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int sell_price = buy_price[i];
            int total = 0;
            for (int j = 0; j < n; j++) {
                if(sell_price<=buy_price[j]&&sell_price>order_price[j]){
                    total+=sell_price-order_price[j];
                }
            }
            if(total>max||total==max&&sell_price<ans) {
                max = total;
                ans = sell_price;}
        }
        System.out.println(ans);
    }
}
