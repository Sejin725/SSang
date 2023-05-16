
public class Solution {
	

	public int solution(int[] numbers) {
        int a = 0, b = 0, index=0 ;
        
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > a ) {
                a = numbers[i];
                index = i; //최대값의 인덱스
            }
        }
        for (int j = 0; j < numbers.length; j++) {
            if(numbers[j] <= a && numbers[j] > b && j != index) {
                b = numbers[j];
            }
        }
        return a*b;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        
        int[] num = {0,31,24,10,1,9};
        //System.out.println(s.solution("workspace"));
        System.out.println(s.solution(num));

    }
}

