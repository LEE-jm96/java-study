package codingTest;

import java.util.Arrays;

public class Solution11 {
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++) {
            int[] copy = new int[commands[i][1] - commands[i][0] + 1];
        	int k = 0;
        	for(int j = commands[i][0] - 1; j  < commands[i][1]; j++ ) {
             	copy[k] = array[j];
             	k++;
            }
            Arrays.sort(copy);
            answer[i] = copy[commands[i][2] - 1];
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = { {2, 5, 3}, {4, 4, 1}, {1, 7, 3} };
		System.out.println(solution(arr, commands));
	}
}
