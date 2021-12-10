package src;

public class NoNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,3,4,6,7,8,0};
		NoNumberSum_Solution nns = new NoNumberSum_Solution();
		nns.solution(numbers);
	}

}
class NoNumberSum_Solution {
    public int solution(int[] numbers) {
    	int  number_list []= new int [10];
    	int answer = 0;
    	for(int i = 0 ; i < numbers.length ; i++) {
    		number_list[numbers[i]] = numbers[i];
    	}
    	for(int i = 1 ; i <number_list.length ; i ++) {
    		if(number_list[i]==0) {
    			answer += i;
    		}
    	}
    	return answer;
    }
}