package codingTest;
import java.util.*;

public class Solution21 {
    public int solution(String s) {
        Stack<String> dStack = new Stack();
        String[] str = s.split("");
        
        for(int i = 0; i < s.length(); i++){
            String st = str[i];
            if(!dStack.isEmpty() && st.equals(dStack.peek())) dStack.pop();
            else dStack.push(st);
        }
        
        return !dStack.isEmpty() ? 0 : 1;
    }
}