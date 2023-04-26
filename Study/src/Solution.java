public class Solution {

    // 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

    public int solution(int n) {
        int answer = 0;
        for (int i = n; i >= 0; i--) {
            if (n%2==0) {
                answer += n;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3));
    }
}

