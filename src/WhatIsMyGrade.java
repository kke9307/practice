package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WhatIsMyGrade {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] jumsu = br.readLine().split(" ");
		int [] student = Arrays.asList(jumsu).stream().mapToInt(Integer::parseInt).toArray();
		int hong = Integer.parseInt(br.readLine().trim());
		if(student[4] <= hong && hong <= student[0]) {
			System.out.println("A+");
		}else if(student[14] <= hong && hong <= student[5]) {
			System.out.println("A0");
		}else if(student[29] <= hong && hong <= student[15]) {
			System.out.println("B+");
		}else if(student[34] <= hong && hong <= student[30]) {
			System.out.println("B0");
		}else if(student[44] <= hong && hong <= student[35]) {
			System.out.println("C+");
		}else if(student[47] <= hong && hong <= student[45]) {
			System.out.println("C0");
		}else {
			System.out.println("F");
		}
		
	}

}
