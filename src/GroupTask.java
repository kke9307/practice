package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GroupTask {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < tc ; i ++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println("#"+(i+1)+" "+(n/3));
		}
	}
}
