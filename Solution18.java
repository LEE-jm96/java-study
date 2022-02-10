package codingTest;

import java.util.ArrayList;

public class Solution18 {
	public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> copyList = new ArrayList<Integer>();
        copyList.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                copyList.add(arr[i]);
            }
        }
        
        answer = new int[copyList.size()];
        for(int i = 0; i < copyList.size(); i++){
            answer[i] = copyList.get(i);
        }
        
        return answer;
    }
}
