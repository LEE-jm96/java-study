##두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요

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
