package src;

import java.util.HashMap;

public class NumberAndAlphabet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberAndAlphabet_Solution ns = new NumberAndAlphabet_Solution();
		System.out.println(ns.solution("one4seveneight"));
	}
}
class NumberAndAlphabet_Solution {
    public int solution(String s) {
    	HashMap<Integer,String> hs = new HashMap<Integer,String>();
    	hs.put(0,"zero");
    	hs.put(1, "one");
    	hs.put(2, "two");
    	hs.put(3, "three");
    	hs.put(4, "four");
    	hs.put(5, "five");
    	hs.put(6, "six");
    	hs.put(7, "seven");
    	hs.put(8, "eight");
    	hs.put(9, "nine");
    	for(int i = 0 ; i < hs.size();i++) {
    		String al = hs.get(i);
	    	if(s.contains(al)) {
	    		String num = String.valueOf(i);
		    	s = s.replace(al, num);
	    	}
    	}
        int answer = Integer.parseInt(s);
        return answer;
    }
}