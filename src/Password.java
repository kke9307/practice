package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Password {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0 ; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			StringBuilder sb = new StringBuilder(st.nextToken());
			for(int j = 1 ; j < sb.length() ; j ++) {
 				if(sb.charAt(j-1) == sb.charAt(j)) {
					sb = sb.delete(j-1, j+1);
					j = 0;
				}
			}
			System.out.println("#"+(i+1)+" "+sb);
		}
	}
}
