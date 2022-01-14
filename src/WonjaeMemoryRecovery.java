package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WonjaeMemoryRecovery {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int i = 1 ; i <= tc ;  i++) {
			String s = br.readLine().trim();
			String m = "";
			int answer = 0 ; 
			for(int j = 0 ; j < s.length(); j++ ) {
				m += "0";
				if(String.valueOf(s.charAt(j)).equals("1")) {
					
				}
			}
		}
	}
}
