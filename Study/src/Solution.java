
public class Solution {
	

	public String solution(String my_string, String letter) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
			if (String.valueOf(my_string.charAt(i))!=letter) {
				answer += my_string.charAt(i);
			}
			System.out.println(i + ". " + answer);
		}
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String a1 = "abcdef";
        String a2 = "f";
        
        //System.out.println(s.solution("workspace"));
        System.out.println(s.solution(a1,a2));

    }
}

