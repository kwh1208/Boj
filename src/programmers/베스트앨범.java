package programmers;

import java.util.*;

public class 베스트앨범 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] genres = {"pop", "pop", "pop", "rap", "rap"};
        int[] plays = {45, 50, 40, 60, 70};
        solution.solution(genres, plays);
    }

    static class Solution {
        public int[] solution(String[] genres, int[] plays) {
            HashMap<String, Integer> numOfPlays = new HashMap<>();
            HashMap<String, Integer> totalNum = new HashMap<>();
            HashMap<String, Integer[]> topMusic = new HashMap<>();
            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < genres.length; i++) {
                numOfPlays.put(genres[i], plays[i]);
                if (!totalNum.containsKey(genres[i])) {
                    totalNum.put(genres[i], plays[i]);
                }
                else {
                    totalNum.put(genres[i], totalNum.get(genres[i]) + plays[i]);
                }
                if (!topMusic.containsKey(genres[i])) {
                    topMusic.put(genres[i], new Integer[]{i, -1});
                }
                else {
                    Integer[] tmp = topMusic.get(genres[i]);
                    int firstPlays = plays[tmp[0]];
                    int first = tmp[0];
                    int secondPlays;
                    if (tmp[1] != -1) secondPlays= plays[tmp[1]];
                    else secondPlays = 0;
                    if (plays[i] > firstPlays) {
                        topMusic.get(genres[i])[0] = i;
                        topMusic.get(genres[i])[1] = first;
                    } else if (firstPlays >= plays[i] && plays[i] > secondPlays) {
                        topMusic.get(genres[i])[1] = i;
                    }
                }
            }

            List<String> keySet = new ArrayList<>(totalNum.keySet());
            keySet.sort((o1, o2) -> totalNum.get(o2).compareTo(totalNum.get(o1)));

            for (String s : keySet) {
                ans.add(topMusic.get(s)[0]);
                if (topMusic.get(s)[1] != -1) {
                    ans.add(topMusic.get(s)[1]);
                }
            }

            int[] result = new int[ans.size()];
            for (int i = 0; i < ans.size(); i++) {
                result[i] = ans.get(i);
            }

            return result;
        }
    }
}
