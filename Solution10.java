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


