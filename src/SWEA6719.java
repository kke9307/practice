package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
//풀이중
public class SWEA6719 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());

		for(int i = 1 ; i <= tc ; i++ ) {
			Double answer = 0.0;
			StringTokenizer st = new StringTokenizer(br.readLine().trim());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			String tmpM [] = br.readLine().split(" ");
			int M [] = Arrays.asList(tmpM).stream().mapToInt(Integer::parseInt).toArray();
			List<int[]> tmp = Arrays.asList(M);
			ArrayList<Integer> choice = new ArrayList<Integer>();
			int max = 0;
			if(N>K) {
				for(int j = 0 ; j < M.length; j++) {
					
				}
			}
			System.out.println("#"+i+" "+answer);
		}

	}

}
