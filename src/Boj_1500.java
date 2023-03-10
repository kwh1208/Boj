import java.util.Scanner;

public class Boj_1500 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int k = sc.nextInt();
        long ans = 1;
        while (true){
            if(s==0) break;
            int tmp = s/k;
            ans*=tmp;
            s-=tmp;
            k--;
        }
        System.out.println(ans);
    }
}
