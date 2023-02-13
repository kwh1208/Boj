import java.util.*;


public class Boj_1026{

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i =0;i<N;i++){
            A[i] = input.nextInt();
        }
        for(int i =0;i<N;i++){
            B[i] = input.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int sum = 0;
        for(int i =0;i<N;i++){
            sum = sum + (A[i]*B[N-1-i]);

        }
        System.out.println(sum);

    }

}