package codingTest;

public class Solution8 {
    public static int solution(int n) {
        int answer = 0, num = 0;
        for(int i = 1;  i <= n; i++){
            for(int j = 1;  j <= i; j++){
                if(i % j == 0){
                    num++;
                }
            }
            if(num == 2){
                answer++;
            }
            num = 0;
        }
        return answer;
    }
    
    public static void main(String[] args) {
		System.out.println(solution(10));
	}
}
