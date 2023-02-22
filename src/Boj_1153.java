import java.util.Scanner;

public class Boj_1153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] isPrime = new boolean[1000001];
        for (int i = 2; i*i <= 1000000; i++) {
            if(isPrime[i]) continue;
            for (int j = i*i; j <1000000; j++) {
                if(j%i==0) isPrime[j]=true;
            }
        }
        StringBuilder sb = new StringBuilder();
        if(n<8) System.out.println(-1);
        else if(n%2==0){//소수면 골드바흐 추측 이용
            n-=4;
            sb.append(2+" "+2+" ");
            for (int i = 2; i <= n / 2; i++) {
                if(!isPrime[i]&&!isPrime[n-i]){
                    sb.append(i+" "+(n-i));
                    break;
                }
            }
            System.out.println(sb);
        }
        else {//홀수면 작은 홀수중에 검사하다가 되면 ok
            for (int i = n-4; i >= 5; i-=2) {
                if(!isPrime[i-2]){
                    sb.append(2+" "+(i-2)+" ");
                    n-=i;
                    break;
                }
            }
            for (int i = 2; i <= n/2; i++) {
                if(!isPrime[i]&&!isPrime[n-i]){
                    sb.append(i+" "+(n-i));
                    break;
                }
            }
            System.out.println(sb);
        }
    }
}
