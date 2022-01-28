package codingTest;

public class Solution6 {
    public static int solution(int[] numbers) {
        int answer = 45;
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){ 
            sum += numbers[i];
        }
        return answer - sum;
    }
    
    public static void main(String[] args) {
		int arr[] = {5, 8, 4, 9, 6, 7, 0};
		System.out.println(solution(arr));
	}
}
