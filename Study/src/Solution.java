public class Solution {
	
/*
	public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> pName = new HashMap<>();
        HashMap<Integer, String> pCnt = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            pName.put(players[i], i + 1);
            pCnt.put(i+1, players[i]);
        }
        // 불릴때 마다 swap 진행
        for (int i = 0; i < callings.length; i++) {

        }
        return players;
    }
*/
	public int solution(String[] s1, String[] s2) {
		int answer = 0;
        for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					answer++;
				}
			}
		}
        return answer;
    }
	
	
	
    public static void main(String[] args) {
        Solution s = new Solution();
    }
}

