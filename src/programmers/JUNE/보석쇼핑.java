package programmers.JUNE;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class 보석쇼핑 {
    class Solution {
        public int[] solution(String[] gems) {
            HashSet<String> set = new HashSet<>(List.of(gems));
            int numOfGems = set.size();
            int s = 0;
            int e = 0;
            Map<String, Integer> currentWindow = new HashMap<>();
            int[] ans = {0, gems.length - 1};
            while (e<gems.length) {
                if (currentWindow.size() == numOfGems) {
                    if(e-s<ans[1]-ans[0]) {
                        ans[0] = s;
                        ans[1] = e;
                    }
                    if (currentWindow.get(gems[s])==1){
                        currentWindow.remove(gems[s]);
                    }
                    else{
                        currentWindow.put(gems[s], currentWindow.get(gems[s])-1);
                    }
                    s++;
                }
                //오른쪽 이동
                else if (currentWindow.size() < numOfGems) {
                    e++;
                    if (e < gems.length){
                    if (currentWindow.containsKey(gems[e])) {
                        currentWindow.put(gems[e], currentWindow.get(gems[e]) + 1);
                    }
                    else{
                        currentWindow.put(gems[e], 1);
                    }}
                }


            }
            return ans;
        }
    }
}
