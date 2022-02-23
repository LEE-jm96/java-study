package codingTest;

public class Solution25 {
    public int solution(int n) {
        int ac = 0;
        
        for(int i = 1; i <= n; i++){
            int answer = 0;
            for(int j = i; j <= n; j++){
                answer += j;
                if(answer == n){
                    ac++;
                    break;
                }
                else if(answer > n) break;
            }
        }
        return ac;
    }
}
