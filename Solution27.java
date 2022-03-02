package codingTest;

public class Solution27 {
	 public int solution(int[] nums) {
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
