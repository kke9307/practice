package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//ing~
public class MinimalismClock {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		int h = 0;
		int m = 0;
		for(int i = 0 ; i < tc ; i++) {
			int d = Integer.parseInt(br.readLine());
			h = d/30;
			m = (d % 30) * 2;
			System.out.println("#"+(i+1)+" "+h+" "+m);
		}
	}

}
