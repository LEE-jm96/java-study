/* 코딩 테스트 공부 - 17
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 */

package codingTest;

import java.util.Arrays;

public class Solution17 {
	class Solution {
	    public String solution(String[] participant, String[] completion) {
	        String answer = null;
	        Arrays.sort(participant);
	        Arrays.sort(completion);
	        
	        for(int i = 0; i < completion.length; i++){
	            if(!participant[i].equals(completion[i])){
	                return participant[i];
	            }
	        }
	        
	        return participant[completion.length];
	    }
	}
}
