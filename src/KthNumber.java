package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,5,2,6,3,7,4};
		int commands [][] = {{2,5,3},{4,4,1},{5,6,3}};
		
		Solution sl = new Solution();
		sl.solution(array, commands);
	}
	static class Solution {
		public int[] solution(int[] array, int commands [][]) {
			int[] answer = {};
			answer = new int[commands.length];
			for (int i = 0; i < commands.length; i++) {
				List<Integer> arrInt = new ArrayList<Integer>();
				for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
					arrInt.add(array[j]);
				}
				Collections.sort(arrInt);
				answer[i] = arrInt.get(commands[i][2] - 1);
			}
			return answer;

		}
	}
}
