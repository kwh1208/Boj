import java.util.Scanner;

public class Boj_1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int length = 1001*500;
        int[] num = new int[length];
        int number = 1;
        int cnt = 0;
        for (int i = 0; i < length; i++) {
            num[i]=number;
            cnt++;
            if(number==cnt){
                cnt=0;
                number++;
            }
        }
        long ans = 0;
        for (int i = s-1; i < e; i++) {
            ans+=num[i];
        }
        System.out.println(ans);
    }
}
