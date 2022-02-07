package codingTest;

public class Solution13 {
    public static int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++){
            int num = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    num++;
                }
            }
            if(num % 2 == 0){
                answer += i;
            }
            else{
                answer -= i;
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
		System.out.println(solution(13, 17));
	}
}
