import java.util.HashMap;
public class Solution {
	

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

    public static void main(String[] args) {
        Solution s = new Solution();

        String[] players = {"mumu","soe","poe","kai","mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        s.solution(players, callings);
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
    }
}

