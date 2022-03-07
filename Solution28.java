package codingTest;

public class Solution28 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i = 0; i < prices.length; i++){
            int num = 0;
            for(int j = i + 1; j < prices.length; j++){
                if(prices[i] <= prices[j]){
                    answer[i] = ++num;
                }
                else{
                    answer[i] = ++num;
                    break;
                }
            }
        }
        return answer;
    }
}
