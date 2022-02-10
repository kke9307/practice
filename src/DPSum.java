package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DPSum {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < t ; i++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int answer = 0;
			String tmp_arr [] = br.readLine().split(" ");
			int arr [] = Arrays.asList(tmp_arr).stream().mapToInt(Integer::parseInt).toArray();
			if(n >= 1 && n<=20 && k >=1 && k <= 1000) {
				for(int j = 0 ; j < arr.length-1; j++) {
					for(int p = j+1 ; p < arr.length; p++) {
						if( k == arr[j]+arr[p]) {
							answer ++;
						}
					}
				}
			}
			System.out.println("#"+(i+1)+" "+answer);
		}
	}
}
