package codingTest;

public class Solution23 {
    public String solution(String phone_number) {
        String answer = "";
        String[] c_number = phone_number.split("");
        for(int i = 0; i < c_number.length; i++){
            if(i < phone_number.length() - 4 ){
                answer += "*";
            } else{
                answer += c_number[i];
            }
        }
        
        return answer;
    }
}