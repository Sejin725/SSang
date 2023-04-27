public class Solution {


    // 배열을 2배 반환 알고리즘
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==n)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {1,2,3,4,5};
        int b = s.solution(a,1);
        // for (int i : b) {
        //     System.out.println(i+" ");
        // }
    }
}

