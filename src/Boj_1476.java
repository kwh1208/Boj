import java.util.Scanner;

public class Boj_1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();
        int ans = 1;
        while (true){
            boolean chk1 = false;
            boolean chk2 = false;
            boolean chk3 = false;
            int x = ans%15;
            if(x==0) x=15;
            int y= ans%28;
            if(y==0) y=28;
            int z = ans%19;
            if(z==0) z=19;
            if(x==e) chk1 = true;
            if(y==s) chk2 = true;
            if(z==m) chk3 = true;
            if(chk1&&chk2&&chk3) break;
            else ans++;
        }
        System.out.println(ans);
    }
}
