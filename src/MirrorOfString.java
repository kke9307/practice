package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MirrorOfString {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int i = 1 ; i <= tc ; i++) {
			String s = br.readLine();
			String answer = "";
			for(int j = s.length()-1 ; j >= 0; j--) {
				answer += String.valueOf(s.charAt(j)); 
			}
			System.out.println("#"+i+" "+answer);
		}
	}
}
