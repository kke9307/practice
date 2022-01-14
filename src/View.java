package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class View {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0 ; i < 10 ; i ++) {
			int answer = 0;
			int tc_length = Integer.parseInt(br.readLine());
			String arr_tmp [] = br.readLine().split(" ");
			int arr [] = Arrays.asList(arr_tmp).stream().mapToInt(Integer::parseInt).toArray();
			for(int j = 2 ; j < tc_length-2; j++) {
				if(arr[j] > arr[j-2] && arr[j] > arr[j-1] && arr[j] > arr[j+1] && arr[j] > arr[j+2]) {
					int a = Math.max(arr[j-2], arr[j-1]);
					int b = Math.max(arr[j+1], arr[j+2]);
					answer += arr[j]-Math.max(a, b);
				}
			}
			System.out.println("#"+(i+1)+" "+answer);
		}
	}
}
