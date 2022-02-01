/* 코딩 테스트 공부 - 9
 * 정수 배열 numbers가 주어집니다. 
 * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
 */
package codingTest;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Solution9 {
    public static int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> addArray = new ArrayList<>();
        
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i + 1; j < numbers.length; j++){
            	int sum = numbers[i] + numbers[j];
                if(!addArray.contains(sum)) {
                	addArray.add(sum);
                }
            }
        }
        
        answer = new int[addArray.size()];
        for(int i = 0; i < addArray.size(); i++) {
        	answer[i] = addArray.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
    
    public static void main(String[] args)  {
    	int[] number = {5, 0, 2, 7};
		System.out.println(Arrays.toString(solution(number)));
    }
}
