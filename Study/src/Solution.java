public class Solution {


    public int solution(int[] numbers) {
        int a = numbers[0], b = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > a )
                a = numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < a && numbers[i] > b)
                b = numbers[i];
        }
        return a*b;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int a[] = {0, 31, 24, 10, 1, 9};
        //System.out.println(s.solution("workspace"));
        System.out.println(s.solution(a));

    }
}

