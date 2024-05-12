package programmers;
import java.util.Arrays;

public class 징검다리 {

    public static class Solution {
        public int solution(int distance, int[] rocks, int n) {
            Arrays.sort(rocks);

            int s = 0;
            int e = distance;

            int result = Integer.MIN_VALUE;
            while (s <= e) {
                int mid = (s + e) / 2;
                int cnt = 0;
                int prev = 0;

                for (int i = 0; i < rocks.length; i++) {
                    if (rocks[i]-prev < mid){
                        cnt++;
                    }
                    else{
                        prev = rocks[i];
                    }
                    if (cnt > n){
                        break;
                    }
                }

                if (distance - prev < mid && cnt<=n){
                    cnt++;
                }
                if (cnt > n){
                    e = mid-1;
                }
                else{
                    s = mid+1;

                    result = mid;
                }


            }
            return result;
        }
    }
}
