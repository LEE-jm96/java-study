/* 코딩 테스트 공부 - 27
 * 주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때,
 * nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
 */

package codingTest;

public class Solution27 {
	public int solution(int[] nums){
	        int answer = 0, count = 0;
	        for(int i = 0; i < nums.length - 2; i++){
	            for(int j = i + 1; j < nums.length - 1; j++){
	                for(int k = j + 1; k < nums.length; k++){
	                    int su = nums[i] + nums[j] + nums[k];
	                    for(int l = 2; l <= su; l++){
	                        if(su % l == 0) count++; 
	                    }
	                    if(count == 1) answer++;
	                    count = 0;
	                }
	            }
	        }
	        return answer;
	}
}
