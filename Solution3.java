package codingTest;

public class Solution3 {
	public static String solution(String[] seoul) {
        String answer = "";
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "�輭���� " + i + "�� �ִ�";
            }
        }
        return answer;
    }
	
	public static void main(String [] args) {
		String arr[] = {"Lee", "Jane", "Kim"};
		System.out.println(solution(arr));
	}
}
