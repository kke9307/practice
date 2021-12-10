package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Sunday {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine().trim());
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0 ; i < tc ; i++) {
			arr.add(br.readLine().trim());
		}
		HashMap <String,Integer> hs = new HashMap<String,Integer>();
		hs.put("SUN", 7);
		hs.put("MON", 6);
		hs.put("TUE", 5);
		hs.put("WED", 4);
		hs.put("THU", 3);
		hs.put("FRI", 2);
		hs.put("SAT", 1);
		for(int i = 0 ; i < tc ; i++) {
		System.out.println("#"+(i+1)+" "+hs.get(arr.get(i)));
		}
	}
}
