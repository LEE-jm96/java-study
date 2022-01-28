/* 코딩 테스트 공부 - 5
 * 1937년 Collatz란 사람에 의해 제기된 이 추측은, 주어진 수가 1이 될때까지 다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니다.
 * 입력된 수가 짝수라면 2로 나눕니다. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
 * 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다. 작업 횟수를 반환해 주세요. 단, 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.
 */

package codingTest;

public class Solution5 {
	    public static int solution(int num) {
	        long ac = num;
	        int answer = 0;
	        while(ac != 1){
	            if(ac % 2 == 0){
	                ac = (ac / 2);
	            }
	            else{
	                ac = (ac * 3) + 1; 
	            }
	            answer++;
	            if(answer == 500){ 
	                answer = -1; 
	                break; 
	            }
	        }
	        return answer;
	    }
    
	    public static void main(String[] args) {
	    	System.out.println(solution(626331));
	    }
}
