package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 프로세스 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{2, 1, 3, 2}, 2));
    }
    static class Solution {
        public int solution(int[] priorities, int location) {
            Queue<Process> queue = new LinkedList<>();

            for (int i = 0; i < priorities.length; i++) {
                queue.add(new Process(priorities[i], i));
            }

            int answer = 0;

            while (!queue.isEmpty()) {
                Process current = queue.poll();

                boolean hasHigherPriority = false;
                for (Process p : queue) {
                    if (p.priority > current.priority) {
                        hasHigherPriority = true;
                        break;
                    }
                }

                if (hasHigherPriority) {
                    queue.add(current);
                } else {
                    answer++;
                    if (current.index == location) {
                        return answer;
                    }
                }
            }

            return answer;
        }

        class Process {
            int priority;
            int index;

            Process(int priority, int index) {
                this.priority = priority;
                this.index = index;
            }
        }

}}
