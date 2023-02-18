import java.util.Scanner;

public class Boj_6588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] chk = new boolean[1000001];//true 면 합성수임.
        for (int i = 2; i*i <= 1000000; i++) {
            if(chk[i]) continue;
            for (int j = i*i; j <1000000; j++) {
                if(j%i==0) chk[j]=true;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (true){
            int n = sc.nextInt();
            if(n==0) break;
            for (int i = 3; i <= n/2; i++) {
                if(!chk[i]&&!chk[n-i]){
                    sb.append(n + " = " + i + " + " + (n-i)+"\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
