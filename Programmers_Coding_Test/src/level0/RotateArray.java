package level0;

public class RotateArray {

	public int[] solution(int[] numbers, String direction) {
		int start = numbers[0];
		int end = numbers[numbers.length-1];
		if (direction.equals("left")) {
			for (int i = 0; i < numbers.length-1; i++) {
				numbers[i] = numbers[i+1];
			}
			numbers[numbers.length-1] = start;
		} else if (direction.equals("right")) {
			for (int i = numbers.length-1; i > 0 ; i--) {
				numbers[i] = numbers[i-1];
			}
			numbers[0] = end;
		}
        int[] answer = numbers;
        return answer;
    }
}
