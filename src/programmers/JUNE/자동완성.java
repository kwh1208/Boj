package programmers.JUNE;

import java.util.Arrays;

public class 자동완성 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new String[]{"abc","def","ghi","jklm"}));;
    }
    static class Solution {
        public int solution(String[] words) {
            int answer = 0;
            Arrays.sort(words);
            for (int i = 0; i < words.length; i++) {
                for (int j = 1; j <= words[i].length(); j++) {
                    if (j==words[i].length()) {
                        answer+=j;
                        break;
                    }
                    String tmp = words[i].substring(0, j);
                    if (i==0){
                        if (!words[i+1].startsWith(tmp)){
                            answer+=j;
                            break;
                        }
                    } else if (i == words.length - 1) {
                        if (!words[i-1].startsWith(tmp)){
                            answer+=j;
                            break;
                        }
                    }
                    else {
                        if (!words[i+1].startsWith(tmp)&&!words[i-1].startsWith(tmp)){
                            answer+=j;
                            break;
                        }
                    }
                }
            }
            return answer;
        }
    }
}
