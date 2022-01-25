/* 코딩 테스트 공부 - 1
 * 부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이
 * 매개변수로 주어질 때 최대 몇 개의 부서에 물품을 지원할
 * 수 있는지 return 하도록 solution 함수를 완성해주세요.
 */
package codingTest;
import java.util.Arrays;
class Solution {
    public static int solution(int[] d, int budget) {
        int answer = 0, sum = 0;
        Arrays.sort(d); //오름차순 정렬
        for(int i = 0; i < d.length; i++){
        	sum += d[i];
        	if(sum > budget){ //예산이 부서에 지원할 값을 충족하지 못할때 
                break;
            }
            answer++;
        }
        return answer;
    }
    public static void main(String[] args){
        int arr[] = {2,2,3,3};
        System.out.print(solution(arr, 10));
    }
}
