public class Solution {


    // 배열을 자르기 알고리즘
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        for (int i = 0; i <= answer.length-1; i++) {
            answer[i] = numbers[num1+i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {1,2,3,4,5};
        int[] b = s.solution(a,1,3);
        for (int i : b) {
            System.out.println(i+" ");
        }
    }
}

