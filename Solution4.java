/* 코딩 테스트 공부 - 4
 * 구매한 로또에 0이 들어있습니다.
 * 0이 들어간 번호가 정답일 때와 아닐 때로 구분합니다.
 * 전부 정답일 때 최고 순위, 정답이 아닐 때 최저 순위를 리턴합니다.
 */

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
