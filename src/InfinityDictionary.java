package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//풀이중
public class InfinityDictionary {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());

		for(int i = 1 ; i <= tc ; i++ ) {
			String answer = "";
			String dic1 = br.readLine().trim().replaceAll(" ", "").toLowerCase();
			String dic2 = br.readLine().trim().replaceAll(" ", "").toLowerCase();
			if(dic1.length() != dic2.length()) {
				if(dic1.length()>dic2.length()) {
					for(int differ = dic1.length()-dic2.length(); differ > 0 ; differ--) {
						dic2 += "a";
					}
				}else {
					for(int differ = dic2.length()-dic1.length(); differ > 0 ; differ--) {
						dic1 += "a";
					}
				}
			}
			boolean yn = true;

			for(int j = 0 ; j < dic1.length(); j++) {
				if(dic1.charAt(j)==dic2.charAt(j)) {
					answer = "N";
				}else {
					//ex azzz baaa
					String dic1_slice = dic1.substring(j+1, dic1.length());
					String dic2_slice = dic2.substring(j+1, dic2.length());
					String a = "";
					String z = "";
					int cnt = dic1_slice.length();
					while(cnt > 0) {
						z += "z";
						cnt--;
					}
					cnt = dic2_slice.length();
					while(cnt > 0) {
						a += "a";
						cnt--;
					}
					if(dic1_slice.equals(z)&&dic2_slice.equals(a)) {
						answer ="N";
					}else {
						answer = "Y";
					}
					yn = false;
					break;
				}
				if(!yn) {
					break;
				}
			}
			System.out.println("#"+i+" "+answer);
		}
	}
}
