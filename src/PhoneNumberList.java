package src;/*전화번호 목록*/

import java.util.HashMap;

public class PhoneNumberList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] phone_book1 = {"119", "97674223", "1195524421"};
		String [] phone_book2 = {"123","456","789"};
		String [] phone_book3 = {"12","123","1235","567","88"};
		
		Solution1 sl1 = new Solution1();
		sl1.solution(phone_book1);
		sl1.solution(phone_book2);
		sl1.solution(phone_book3);
	}

}
class Solution1 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<Integer , String> hs = new HashMap<>();
        int i = 0 ;
        for(String str : phone_book) {
        	hs.put(i,str);
        	i++;
        }
        int j = 0;
        while(j != phone_book.length) {
        	int k = 0;
        	while(k!=phone_book[j].length()) {
        		if(hs.containsValue(phone_book[j].substring(0, k))) {
        			answer = false;
        			break;
        		}
    			k++;
        	}
        	if(answer == false) break;
        	j++;
        }
        return answer;
    }
}