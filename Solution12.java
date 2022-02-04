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