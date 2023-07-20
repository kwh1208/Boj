import java.util.Scanner;

public class Boj_6359 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(ans(n));
        }
    }
    static int ans(int x){
        if(5<=x&&x<9) return 2;
        if (9<=x&&x<16) return 3;
        if (16<=x&&x<25) return 4;
        if (25<=x&&x<36) return 5;
        if (36<=x&&x<49) return 6;
        if (49<=x&&x<64) return 7;
        if (64<=x&&x<81) return 8;
        if (81<=x&&x<100) return 9;
        else return 10;
    }
}
