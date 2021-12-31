package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Gugudan1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < tc ; i ++) {
			int N = Integer.parseInt(br.readLine());
			if(N>0 && N<=100) {
			String answer = "No";
			for(int j = 1; j < 10 ; j++) {
				for(int k = 1; k < 10 ; k++) {
					if(j*k == N) {
						answer = "Yes";
					}
				}
			}
			System.out.println("#"+(i+1)+" "+answer);
			}
		}
	}
}
