import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_21735 {
    static int[] snow;
    static int n;
    static int m;
    static int max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        n = Integer.parseInt(str.nextToken());
        m = Integer.parseInt(str.nextToken());
        snow = new int[n+1];
        str = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            snow[i] = Integer.parseInt(str.nextToken());
        }
        roll(1, 0, 0, true);
        System.out.println(max);
    }

    private static void roll(int now, int time, int location, boolean roll_throw) {
        if(time==m+1||location>n){
            max=Math.max(max, now);
            return;
        }
        //roll_throw==true 굴린거, false 던진거
        if(roll_throw)
            now+=snow[location];
        else {
            now/=2;
            now+=snow[location];
        }
        //굴리거나
        roll(now, time+1, location+1, true);
        //던지거나
        roll(now, time+1, location+2, false);
    }
}
