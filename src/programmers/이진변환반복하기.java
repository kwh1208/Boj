package programmers;

public class 이진변환반복하기 {
    public static void main(String[] args) {
        int[] solution1 = solution("110010101001");
        System.out.println(solution1[0]+" "+solution1[1]);
        int[] solution2 = solution("01110");
        System.out.println(solution2[0]+" "+solution2[1]);
        int[] solution3 = solution("1111111");
        System.out.println(solution3[0]+" "+solution3[1]);
    }
    public static int[] solution(String s) {
        int[] answer = {0, 0};

        while (!s.equals("1")){
            answer[0]++;
            int old = s.length();
            String blank = "";
            s= s.replaceAll("0", blank);
            int new_ = s.length();
            answer[1] += old-new_;

            s = Integer.toBinaryString(new_);
        }
        return answer;
    }
}
