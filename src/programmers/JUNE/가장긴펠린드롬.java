package programmers.JUNE;

public class 가장긴펠린드롬 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("aaaa"));
    }
    static class Solution
    {
        public int solution(String s)
        {
            int answer = 1;
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < s.length(); j++) {
                    if (i-j<0||i+j>=s.length()){
                        break;
                    }
                    if(s.charAt(i-j)==s.charAt(i+j)){
                        answer = Math.max(answer,2*j+1);
                    }
                    else{
                        break;
                    }
                }
            }

                //앞으로 확인
                for (int i = 0; i < s.length(); i++) {
                    for (int j = 0; j < s.length(); j++) {
                        if (i-j-1<0||i+j>=s.length()){
                            break;
                        }
                        if(s.charAt(i-j-1)==s.charAt(i+j)){
                            answer = Math.max(answer,2*(j+1));
                        }
                        else break;
                    }
                }
                //뒤로 확인
                for (int i = 0; i < s.length(); i++) {
                    for (int j = 0; j < s.length(); j++) {
                        if (i-j<0||i+j+1>=s.length()){
                            break;
                        }
                        if(s.charAt(i-j)==s.charAt(i+j+1)){
                            answer = Math.max(answer,2*(j+1));
                        }
                        else break;
                    }
                }

            return answer;
        }
    }
}
