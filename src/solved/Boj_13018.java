package solved;

import java.util.*;

import static java.lang.System.*;


public class Boj_13018{
    static Scanner sc = new Scanner(in);
    static int n = sc.nextInt();
    static int k = sc.nextInt();
    static int[] num = new int[n+1];
    public static void main(String[] args) {
        for (int i = 1; i < n + 1; i++) {
            num[i] = i;
        }
        if(k==n) out.println("Impossible");
        else {
            int cnt = (n-1)-k;//최대공약수가 1초과인 항의 개수(첨에는 1빼고 n-1개임)
            //바로 옆에 있는 친구하고 바꾸면(1빼고 2부터 시작해서) 2씩 줄어듬.
            //만약에 1이 필요하면 1하고 아무거나하고 바꾸면 됨.
            if(cnt%2==1) {swap(1, n);cnt--;}
            cnt/=2;
            int start = 2;
            for (int i = 0; i < cnt; i++) {
                swap(start, start+1);
                start+=2;
            }
            for (int i = 1; i < n+1; i++) {
                out.print(num[i]+" ");
            }

        }
    }
    public static void swap(int x, int y){
        int tmp = num[x];
        num[x] = num[y];
        num[y] = tmp;
    }
}