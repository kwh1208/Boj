package programmers;

public class 카펫 {
    class Solution {
        public int[] solution(int brown, int yellow) {
            int area = brown + yellow;
            for(int i = 1;i<=2005000;i++){
                for(int j = 1;j*j<=2005000;j++){
                    if((i*j)==area&&(i-2)*(j-2)==yellow){
                        int a = Math.max(i, j);
                        int b = Math.min(i, j);
                        return new int[]{a, b};
                    }
                }
            }
            return null;
        }
    }
}