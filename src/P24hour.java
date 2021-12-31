package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P24hour {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < tc ; i ++) {
			BufferedReader br_tc = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			if(first+second < 24) {
				System.out.println("#"+i+" "+(first+second));
			}else if(first+second > 24) {
				System.out.println("#"+i+" "+((first+second)-24));
			}else {
				System.out.println("#"+i+" "+0);
			}
		}
	}

}
