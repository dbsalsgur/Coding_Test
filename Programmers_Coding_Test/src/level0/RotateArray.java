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
//문제 설명
//정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 
//배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
//
//제한사항
//3 ≤ numbers의 길이 ≤ 20
//direction은 "left" 와 "right" 둘 중 하나입니다.
//입출력 예
//numbers	direction	result
//[1, 2, 3]	"right"	[3, 1, 2]
//[4, 455, 6, 4, -1, 45, 6]	"left"	[455, 6, 4, -1, 45, 6, 4]