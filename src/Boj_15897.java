import java.util.Scanner;

public class Boj_15897 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long cnt = 0;
        int j;
        for (int i = 1; i < n; i=j+1) {
            j=(n-1)/((n-1)/i);
            cnt+= (long) (n - 1) / i *(j-i+1);
        }
        System.out.println(cnt+n);
    }
}
