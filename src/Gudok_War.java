package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gudok_War {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int i = 1 ; i <= tc ; i++) {
			int max = 0;
			int min = 0;
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			int N = Integer.parseInt(st.nextToken());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			if(A+B >= N) {
				max = Math.min(A, B);
				min = A+B-N;
			}else{
				max = Math.min(A,B);
				min = 0;
			}
			System.out.println("#"+i+" "+max+" "+min);
		}
	}
}
