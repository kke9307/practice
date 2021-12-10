package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gugudan2 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine().trim());
		int answer = 0;
		for(int i = 0 ; i < tc ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(10 <= a || 10 <= b) {
				answer = -1;
			}else {
				answer = a*b;
			}
			System.out.println("#"+(i+1)+" "+answer);
		}
	}
}
