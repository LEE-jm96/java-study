/* 코딩 테스트 공부 - 9
 * 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다.
 * s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
 */
package codingTest;

public class Solution10 {
    public static int solution(String s) {
        String[] numbers = {"zero", "one", "two", "three", "four", "five"
                            ,"six", "seven", "eight", "nine"};
        
        for(int i = 0; i < numbers.length; i++){
            s = s.replace(numbers[i], Integer.toString(i));
        }
        
        return Integer.parseInt(s);
    }
    
    public static void main(String[] args) {
		String arr = "23four5six78nine";
		System.out.println(solution(arr));
    }
}


