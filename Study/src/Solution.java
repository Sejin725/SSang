
public class Solution {
	

	public int solution(int n) {
        int answer = n/7;
        if(n%7!=0) {
        	answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int m = 1;
        //System.out.println(s.solution("workspace"));
        System.out.println(s.solution(m));

    }
}

