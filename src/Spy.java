package src;

import java.util.ArrayList;
import java.util.HashMap;

public class Spy {
	public static void main(String args[]) {
		Solution3 sl3 = new Solution3();
		String [][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(sl3.solution(clothes));
	}
}

class Solution3{
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, String> hs = new HashMap<>();
        HashMap<String, String> hs2 = new HashMap<>();
        for(int i = 0 ; i < clothes.length; i++) {
        		hs.put(clothes[i][0],clothes[i][1]);
        }

		/*        hs.forEach((key,value) ->{
			System.out.println(key+":"+value);
		});*/
        ArrayList<String> arr = new ArrayList<>();
        for(String item : hs.values()) {
        	System.out.println(item);
        	arr.add(item);
        }
        for(int i = 0 ; i < arr.size(); i ++) {
        	hs2.put(arr.get(i),arr.get(i));
        }
        answer = arr.size() + hs2.size();
        return answer;
    }
}