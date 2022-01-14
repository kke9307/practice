package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PasswordMaker {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 1; i <= 10 ; i++) {
			int tc_num = Integer.parseInt(br.readLine());
			String tmp_arr [] = br.readLine().split(" ");
			int arr [] = Arrays.asList(tmp_arr).stream().mapToInt(Integer::parseInt).toArray();
			int arr_cp [] = arr;
			int k = 1;
			while(arr_cp[arr.length-1] > 0) {
				if(k == 6) k = 0;
				if(arr[0]-k > 0 ) {
					arr_cp[arr.length-1] = arr[0]-k;
				}else {
					arr_cp[arr.length-1] = 0;
					for(int j = 1; j < arr.length-1; j++) {
						arr_cp[j-1] = arr_cp[j];
					}
					break;
				}
				for(int j = 1; j < arr.length-1; j++) {
					arr_cp[j-1] = arr_cp[j];
				}
				arr = arr_cp;
				k++;
			}
			System.out.print("#"+tc_num+" "+Arrays.toString(arr_cp));
		}
		br.readLine();
	}
}
 