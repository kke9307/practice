package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JuiceDivide {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int i = 1; i <= tc ; i++) {
			int N = Integer.parseInt(br.readLine());
			String answer = "";
			for(int j = 0 ; j < N; j++) {
				answer += "1/"+N+" ";
			}
			System.out.println("#"+i+" "+answer);
		}
	}
}
