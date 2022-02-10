package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArmWrestling {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int i = 1 ; i <= tc ; i++) {
			String arr [] = br.readLine().split("");
			int cnt = 0;
			if(arr.length <= 15) {
				for(int j = 0 ; j < arr.length ; j++) {
					if(arr[j].equals("o")) {
						cnt ++;
					}
				}
				cnt += 15 - arr.length;
			}
			System.out.println("#"+i+" "+((15 - cnt) < cnt ? "YES" : "NO"));
		}
	}
}
