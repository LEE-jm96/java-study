package codingTest;

import java.util.*;
public class Solution24 {
	class Solution {
	    boolean solution(String s) {
	        Stack<Character> cstack = new Stack<Character>();
	        
	        if(s.charAt(0) == ')') return false;
	        else{
	            cstack.push(s.charAt(0));
	            for(int i = 1; i < s.length(); i++){
	                if(s.charAt(i) == '('){
	                    cstack.push(s.charAt(i));
	                }
	                else{
	                    if(cstack.isEmpty()) return false;
	                    cstack.pop();
	                }
	            }
	        }
	        return cstack.isEmpty() ? true : false;
	    }       
	}
}
