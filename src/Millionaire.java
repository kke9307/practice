package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Millionaire {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int cnt = sc.nextInt();
		for(int i = 0 ; i < cnt ; i++) {
			Scanner  sc2 = new Scanner(new InputStreamReader(System.in));
			int caseCnt = sc2.nextInt();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < caseCnt; j++) {
				System.out.println(st.nextToken());
			}
		}
	}

}
