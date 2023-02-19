import java.util.Scanner;

public class Boj_2003{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        int s = 0, e = 0, cnt = 0;//시작점, 끝점, 경우의 수
        int sum = arr[0];//합 초깃값 설정

        while (true){
            if(sum==M) {
                cnt++;e++;
                if(e==N) break;
                sum+=arr[e];}
            else if (sum<M) {
                e++;
                if(e==N) break;
                sum+=arr[e];
            }
            else if (sum>M) {
                sum-=arr[s];
                s++;
            }
            /*s는 땡겨주기전에 합에서 먼저 빼고 땡겨줘야되고
            e는 한칸 늘리고 합에 더해줘야함.
            순서 주의!
            */
        }

        System.out.println(cnt);
    }
}