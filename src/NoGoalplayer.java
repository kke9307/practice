package src;/*완주하지 못한 선수*/

import java.util.HashMap;

public class NoGoalplayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sl = new Solution();
		String [] participant = {"mislav", "stanko", "mislav", "ana"};
		String [] completion =	{"stanko", "ana", "mislav"};
		sl.solution(participant, completion);
	}

}
class Solution {
    public String solution(String[] participant, String[] completion) {
    		String answer = "";
			HashMap<String, Integer> hs = new HashMap<String, Integer>();
			int i = 0;
			for(String str : participant) {
				hs.put(str, hs.getOrDefault(str, 0) + 1);
			}
			for (String str : completion) {
				hs.put(str, hs.get(str)-1);
			}
			for(String str : hs.keySet()) {
				if(hs.get(str) != 0) {
					answer = str;
				}
			}
			return answer;
    }
}