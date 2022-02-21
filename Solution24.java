/* 코딩 테스트 공부 - 24
 * 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다.
 * '(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.
 */

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
