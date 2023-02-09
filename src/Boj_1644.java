import java.util.Scanner;

public class Boj_1644 {
    static int[] prime = new int[500000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        eratos();
        int s = 0;
        int e = 0;
        int sum =prime[0];
        int ans = 0;
        while (true){
            if(sum>n||e==499999) {
                sum-=prime[s];
                s++;
            }
            else if(sum<n) {
                e++;sum+=prime[e];
            }
            if(sum==n) {ans++;sum-=prime[s];s++;}
            if(s==499999) break;
        }
        System.out.println(ans);
    }
    public static void eratos(){
        boolean[] chk = new boolean[4000001];
        for (int i = 2; i*i <= 4000000; i++) {
            if(chk[i]) continue;
            for (int j = i*i; j <= 4000000; j++) {
                if(j%i==0) chk[j]=true;
            }
        }
        int tmp = 0;
        for (int i = 2; i <= 4000000; i++) {
            if(!chk[i]) {
                prime[tmp] = i;tmp++;
            }
        }
    }
}
