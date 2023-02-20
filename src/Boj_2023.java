import java.util.Scanner;

public class Boj_2023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int[] prime = new int[20];
        int[] prime_copy = new int[20];
        prime[0] = 2;
        prime[1] = 3;
        prime[2] = 5;
        prime[3] = 7;
        for (int i = 0; i < n - 1; i++) {
            int tmp = 0;
            for (int k : prime) {
                if(k==0) break;
                if(isPrime(k*10+1)) {prime_copy[tmp]=k*10+1;tmp++;}
                if(isPrime(k*10+3)) {prime_copy[tmp]=k*10+3;tmp++;}
                if(isPrime(k*10+7)) {prime_copy[tmp]=k*10+7;tmp++;}
                if(isPrime(k*10+9)) {prime_copy[tmp]=k*10+9;tmp++;}
            }
            for (int j = 0; j < 20; j++) {
                prime[j]=prime_copy[j];
                prime_copy[j]=0;
            }
        }
        for (int k : prime) {
            if(k==0) break;
            sb.append(k).append("\n");
        }
        System.out.println(sb);
    }
    public static boolean isPrime(int x){
        for (int i = 2; i*i <= x; i++) {
            if(x%i==0) return false;
        }
        return true;
    }
}
