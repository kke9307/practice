package src;

public class New_RandomId {
	public static void main(String args []) {
		RandomId_Solution rs = new RandomId_Solution();
		System.out.println(rs.solution("...!@BaT#*..y.abcdefghijklm"));;
		System.out.println(rs.solution("z-+.^."));;
		System.out.println(rs.solution("=.="));;
		System.out.println(rs.solution("123_.def"));
		System.out.println(rs.solution("abcdefghijklmn.p"));;
		
	}
}
class RandomId_Solution {
    public String solution(String new_id) {
        String match = "[^\uAC00-\uD7A30-9a-zA-Z-\\-_.)]";
        new_id = new_id.toLowerCase(); // 1단계
        new_id = new_id.replaceAll(match, "");//2단계
        match = "\\.{2,}";
        new_id = new_id.replaceAll(match, ".");//3단계
        match = "^[.]|[.]$"; 
        new_id = new_id.replaceAll(match, "");//4단계
        if(new_id.length() == 0) new_id="a"; //5단계
        if(new_id.length() >= 15) {
        new_id = new_id.substring(0, 15);//6단계
        match = "^[.]|[.]$"; 
        new_id = new_id.replaceAll(match, "");
        }else if(new_id.length() <= 2) {
        	while(new_id.length() < 3) {	
        	new_id += new_id.charAt(new_id.length()-1);
        	}
        }
        return new_id;
    }
}