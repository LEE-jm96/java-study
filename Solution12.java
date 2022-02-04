/* 코딩 테스트 공부 - 12
 * 당신은 폰켓몬을 잡기 위한 오랜 여행 끝에, 홍 박사님의 연구실에 도착했습니다. 홍 박사님은 당신에게 자신의 연구실에 있는 총 N 마리의 폰켓몬 중에서 N/2마리를 가져가도 좋다고 했습니다.
 * 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
 * array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
 * 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
 * 2에서 나온 배열의 3번째 숫자는 5입니다.
 */

package codingTest;

import java.util.List;
import java.util.ArrayList;

public class Solution12 {
    public static int solution(int[] nums) {
        int answer = 0;
        List<Integer> copyArray = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            if(!copyArray.contains(nums[i])){
                copyArray.add(nums[i]);
            }
        }
        
        if(copyArray.size() < nums.length / 2){
            answer = copyArray.size();
        }
        else{
            answer = nums.length / 2;
        }
               
        return answer;
    }
    
    public static void main(String[] args) {
		int[] nums = {3, 1, 2, 3};
		System.out.println(solution(nums));
	}
}
