package codingTest;

import java.util.Arrays;

public class Solution22 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        for(int i = 0; i < strings.length; i++){
            String str = strings[i].substring(n, n + 1);
            strings[i] = str + strings[i];
        }
        
        Arrays.sort(strings);
        
        for(int j = 0; j < strings.length; j++){
            answer[j] = strings[j].substring(1);
        }
        
        return answer;
    }
}