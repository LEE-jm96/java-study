package codingTest;

public class Solution20 {
    boolean solution(String s) {
        boolean answer = true;
        int pcnt = 0, ycnt = 0;
        String str = s.toLowerCase();
        String[] st = str.split("");
        
        for(int i = 0; i < st.length; i++){
            if(st[i].equals("p")) pcnt++;
            else if(st[i].equals("y")) ycnt++;
        }
        
        if(pcnt == ycnt) return answer;
        else return !answer;
    }
}

