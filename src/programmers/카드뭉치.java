package programmers;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class 카드뭉치 {
    public static void main(String[] args) {
        String[] card1 = {"i", "drink", "water"};
        String[] card2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        Solution solution = new Solution();
        System.out.println(solution.solution(card1, card2, goal));
    }
    static class Solution {
        public String solution(String[] cards1, String[] cards2, String[] goal) {
            Deque<String> card1 = new LinkedList<>();
            Deque<String> card2 = new LinkedList<>();

            Collections.addAll(card1, cards1);
            Collections.addAll(card2, cards2);

            for (String target : goal) {
                if (card1.peek() != null && card1.peek().equals(target)) {
                    card1.pop();
                    continue;
                }
                if (card2.peek() != null && card2.peek().equals(target)) {
                    card2.pop();
                    continue;
                }
                return "No";
            }

            return "Yes";
        }
    }
}
