package programmers.JUNE;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수 {
    public class Solution {
        public static String solution(int[] numbers) {
            String[] numStrs = new String[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                numStrs[i] = String.valueOf(numbers[i]);
            }

            Arrays.sort(numStrs, new Comparator<String>() {
                @Override
                public int compare(String a, String b) {
                    return (b + a).compareTo(a + b);
                }
            });

            StringBuilder result = new StringBuilder();
            for (String numStr : numStrs) {
                result.append(numStr);
            }


            if (result.charAt(0) == '0') {
                return "0";
            }

            return result.toString();
        }
    }
}
