/* �ڵ� �׽�Ʈ ���� - 1
 * �μ����� ��û�� �ݾ��� ����ִ� �迭 d�� ���� budget��
 * �Ű������� �־��� �� �ִ� �� ���� �μ��� ��ǰ�� ������
 * �� �ִ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.
 */
package codingTest;
import java.util.Arrays;
class Solution {
    public static int solution(int[] d, int budget) {
        int answer = 0, sum = 0;
        Arrays.sort(d); //�������� ����
        for(int i = 0; i < d.length; i++){
        	sum += d[i];
        	if(sum > budget){ //������ �μ��� ������ ���� �������� ���Ҷ� 
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
