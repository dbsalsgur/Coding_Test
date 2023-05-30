package level0;

public class Test {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4};
		int k = 2;
		
		int i = 0;
		int cnt = 0;
		int answer = 0;
		while(i < numbers.length) {
			answer = numbers[i]; 
			cnt++;
			if (i == numbers.length - 1) {
				i = -1;
			} else if (i == numbers.length - 2){
				i = -2;
			}
			if (cnt == k) {
				break;
			}
			i += 2;
		}
		System.out.println(answer);
	}
}

