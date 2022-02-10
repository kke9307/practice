package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class JewelryKing {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int i = 1; i <= tc; i++) {
			int N = Integer.parseInt(br.readLine());
			String tmp [] = br.readLine().split(" ");
			int arr [] = Arrays.asList(tmp).stream().mapToInt(Integer::parseInt).toArray();
			int min=arr[0],max = 1;
			for(int k = 0 ; k < arr.length ; k++) {
				min = Math.min(min, arr[k]);
				max = Math.max(max, arr[k]);
			}
			System.out.println("#"+i+" "+min*max);
		}
	}
}
