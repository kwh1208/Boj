import java.util.Scanner;

public class Boj_12979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int a = sc.nextInt();
        if(a==1) {
            int ans = 0;
            ans+=fold(1, Math.max(w, h));
            ans+=fold(1, Math.min(w, h));
            System.out.println(ans);
        }
        else {
        int[] a_fac = factorization(a);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < a; i+=2) {
            int tmp = 0;
            int tmp1 = 0;
            if(a_fac[i]==0) break;
            if(a_fac[i]<=Math.min(w, h)&&a_fac[i+1]<=Math.max(w, h)){
                    tmp=fold(a_fac[i+1], Math.max(w, h));
                    tmp+=fold(a_fac[i], Math.min(w, h));

                    tmp1=fold(a_fac[i], Math.max(w, h));
                    tmp1+=fold(a_fac[i+1], Math.min(w, h));

                if(ans>Math.min(tmp, tmp1)) {ans=Math.min(tmp, tmp1);
            }
            }
        }
        if(ans==Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(ans);
        }
    }
    public static int[] factorization(int x){
        int[] tmp = new int[x];
        int cnt = 0;
        for (int i = 1; i*i <= x; i++) {
            if(x%i==0){
                tmp[cnt] = i;cnt++;
                tmp[cnt] = x/i;cnt++;
            }
        }
        return tmp;
    }
    public static int fold(int x, int y){//x가 목표 y가 현재
        int cnt = 0;
        if(x>y) return 1000000;
        while (x < y) {
            y = (int) Math.round(y / 2.0);
            cnt++;
        }
        return cnt;
    }
}
