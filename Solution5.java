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
