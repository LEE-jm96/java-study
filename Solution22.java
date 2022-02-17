/* 코딩 테스트 공부 - 22
 * 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
 * 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
 */

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
