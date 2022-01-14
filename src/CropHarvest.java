package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CropHarvest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < tc ; i++ ) {
			int n = Integer.parseInt(br.readLine());
			if(1 <= n && n <= 49) {
				int[][] arr = new int [n][n];
				for(int j = 0 ; j < n ; j++) { // 배열에 값 넣기
					String s = br.readLine();
					for(int k = 0; k < n ; k++) {
						arr[j][k] = Integer.parseInt(String.valueOf(s.charAt(k)));
					}
				}
				
				for(int h = n/2 ; n >=0 ; n--) {
					for(int g = h ; g < n/2 ; g--) {
						
					}
				}
				
			}
		}
	}
}
