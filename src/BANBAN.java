package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BANBAN {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < tc ; i++) {
			String S = br.readLine().trim();
			HashSet<String> hs = new HashSet<String>();
			for(int j = 0 ; j < S.length(); j++) {
				hs.add(String.valueOf(S.charAt(j)));
			}
			String answer = "No";
			if(hs.size()==2) {
				answer = "Yes";
			}
			System.out.println("#"+(i+1)+" "+answer);
		}
	}

}
