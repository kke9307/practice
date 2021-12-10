package src;

public class Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = new int [9][9];
		int dx [] = {0,0,-1,1};
		int dy [] = {-1,1,0,0};
		for(int i = 0; i < 9; i++) {
			for(int j = 0 ; j < 9; j++) {
				for(int k = 0 ; k < 4; k++) {
					int tmpX = i + dx[k];
					int tmpY = i + dy[k];
					
				}
			}
		}
	}
}
