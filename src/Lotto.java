package src;

import java.util.ArrayList;
import java.util.Arrays;

public class Lotto {
	public static void main(String args[]) {
		Lotto_Solution ls = new Lotto_Solution();
		int [] lottos = {44, 1, 0, 0, 31, 25};
		int [] win_nums = {31, 10, 45, 1, 6, 19};
		
		ls.solution(lottos, win_nums);
		
	}	
}
class Lotto_Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
    	int unknown_cnt = 0;
    	for(int i = 0 ; i < lottos.length ; i++) {
    		if(lottos[i]==0) {
    			unknown_cnt++;
    		}
    	}
    	ArrayList<Integer> win_nums_list = new ArrayList<Integer>();
    	for(int i : win_nums) {
    		win_nums_list.add(i);
    	}
    	int min_result = min_result(lottos, win_nums);
    	int max_result = max_result(lottos, win_nums, unknown_cnt);
    	int[] answer = {ranking(max_result),ranking(min_result)};
        return answer;
    }
    
    public int min_result(int[] lottos, int[] win_nums) {
    	ArrayList<Integer> win_nums_list = new ArrayList<Integer>();
    	for(int i : win_nums) {
    		win_nums_list.add(i);
    	}
    	int match_cnt = 0;
    	for(int i = 0 ; i < lottos.length ; i++) {
    		if(win_nums_list.contains(lottos[i])) {
    			match_cnt++;
    		}
    	}
    	return match_cnt;
    }
    
    public int max_result(int[] lottos, int[] win_nums, int unknown_cnt) {
    	ArrayList<Integer> win_nums_list = new ArrayList<Integer>();
    	for(int i : win_nums) {
    		win_nums_list.add(i);
    	}
    	int match_cnt = 0;
    	for(int i = 0 ; i < lottos.length ; i++) {
    		if(win_nums_list.contains(lottos[i])) {
    			match_cnt++;
    		}
    	}
    	return match_cnt + unknown_cnt;
    }
    
    public int ranking(int lottos) {
    	int rank = 0;
    	if(lottos == 6)rank = 1;
    	if(lottos == 5)rank = 2;
    	if(lottos == 4)rank = 3;
    	if(lottos == 3)rank = 4;
    	if(lottos == 2)rank = 5;
    	if(lottos == 1 || lottos ==0)rank = 6;
		return rank; 
    }
}

