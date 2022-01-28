package codingTest;

public class Solution7 {
	    public static long solution(int price, int money, int count) {
	        long answer = 0;
	        long upmoney = 0;
	        for(int i = 1; i <= count; i++){
	            upmoney += price * i;
	        }
	        answer = upmoney - money;
	        if(answer <= 0){
	            return 0;
	        }
	        else{
	            return answer;
	        }
	    }
	    
	    public static void main(String[] args) {
	    	System.out.println(solution(3, 20, 4));
		}
}
