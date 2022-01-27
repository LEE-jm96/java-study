package codingTest;

class Solution4{
	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {6,6};
        int zeroCnt = 0;
        int matchCnt = 0;
        
        for(int lotto : lottos) {
        	if(lotto == 0) zeroCnt++;
        }
        
        for(int i = 0; i < win_nums.length; i++) {
        	for(int j = 0; j < win_nums.length; j ++) {
        		if(lottos[i] == win_nums[j]) {
        			matchCnt++;
        		}
        	}
        }
        if(zeroCnt != 0 || matchCnt != 0) {
        	answer[0] = 7 - (matchCnt + zeroCnt);
        	answer[1] = 7 - (matchCnt == 0 ? 1 : matchCnt);
        }
        return answer;
    }
}