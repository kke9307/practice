package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class IncomeInequality {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < tc ; i++ ) {
			int N = Integer.parseInt(br.readLine());
			String arr [] = br.readLine().split(" ");
			Integer [] arr2 = Stream.of(arr).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
			int income = 0;
			for(int j = 0 ; j < N ; j++) {
				income += arr2[j];
			}
			int average = income/N;
			int answer = 0;
			for(int k = 0 ; k < arr2.length; k++) {
				if(average >= arr2[k]) {
					answer ++;
				}
			}
			System.out.println("#"+(i+1)+" "+answer);
		}
	}
}
