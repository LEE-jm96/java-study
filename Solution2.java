package codingTest;

public class Solution2 {
	public static long solution(int a, int b) {
		long answer = 0;
		if(a == b) {
			answer = a;
		}
		else if(a > b) {
			for(int i = a; i >= b; i--) {
				answer += i;
			}
		}
		else {
			for(int i = a; i <= b; i++) {
				answer += i;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.print(solution(6,3));
	}
}
