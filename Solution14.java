/* 코딩 테스트 공부 - 14
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
 */

package codingTest;

public class Solution14 {
	public static String solution(String s) {
        String answer = "";
        String str[] = s.split("");
        int idx = 0;
        for(int i = 0; i < str.length; i++){
            if(str[i].equals(" ")){
                idx = 0;
            }
            else{
                if(idx % 2 == 0){
                    str[i] = str[i].toUpperCase();
                    idx++;
                }
                else{
                    str[i] = str[i].toLowerCase();
                    idx++;
                }
            }  
            answer += str[i];
        }
        return answer;
    }
	
    public static void main(String[] args) {
	    String str = "try hello world";
	    System.out.println(solution(str));
    }
}
