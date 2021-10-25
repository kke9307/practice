package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class practice {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().trim();
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		hm.put("four", 4);
		hm.put("five", 5);
		hm.put("six", 6);
		hm.put("seven", 7);
		hm.put("eight", 8);
		hm.put("nine", 9);
	
		
		for(int i = 0 ; i < hm.size(); i++) {
		}
		System.out.println("99");
	}
}	
