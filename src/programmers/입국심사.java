package programmers;

public class 입국심사 {
    public static void main(String[] args) {
        int[] a = {7, 10};
        System.out.println(solution(6, a));
    }
    public static long solution(int n, int[] times) {
        long answer = 0;
        long s = 0;
        long e = (long)times[times.length-1] * n;
        while (s<=e){
            long tmp = (s+e)/2;

            long now = 0;
            for (long time : times) {
                now+=tmp/time;
            }
            if(now>=n){
                answer = tmp;
                e = tmp-1;
            }
            else {
                s = tmp+1;
            }
        }
        return answer;
    }
}
