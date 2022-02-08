/* 코딩 테스트 공부 - 12
 * 당신은 폰켓몬을 잡기 위한 오랜 여행 끝에, 홍 박사님의 연구실에 도착했습니다. 홍 박사님은 당신에게 자신의 연구실에 있는 총 N 마리의 폰켓몬 중에서 N/2마리를 가져가도 좋다고 했습니다.
 * 홍 박사님 연구실의 폰켓몬은 종류에 따라 번호를 붙여 구분합니다. 따라서 같은 종류의 폰켓몬은 같은 번호를 가지고 있습니다.
 * 예를 들어 연구실에 총 4마리의 폰켓몬이 있고, 각 폰켓몬의 종류 번호가 [3번, 1번, 2번, 3번]이라면 이는 3번 폰켓몬 두 마리, 1번 폰켓몬 한 마리, 2번 폰켓몬 한 마리가 있음을 나타냅니다. 
 * N마리 폰켓몬의 종류 번호가 담긴 배열 nums가 매개변수로 주어질 때, N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아 return  하세요.
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
