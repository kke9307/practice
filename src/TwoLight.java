package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoLight {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < tc ; i ++) {
			int answer = 0 ;
			StringTokenizer st = new StringTokenizer(br.readLine());
			//전구 1
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			//전구 2
			int C = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());
			
			if( A >= 0 && A <= 100 && B >= 0 && B <= 100 && C >= 0 && C <= 100 && D >= 0 && D <= 100) {
				if(C <= A) { // 전구 2 먼저 시작
					if(C <= A && A <= D) {
						answer = Math.min(B,D) -  Math.max(A,C);
					}
				}else if(C > A){ // 전구 1이 먼저 시작
					if(A <= C && C <= B) {
						answer = Math.min(B,D) -  Math.max(A,C);
					}
				}else {
				}
				System.out.println("#"+(i+1)+" "+answer);
			}
		}
	}
}
