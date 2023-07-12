package level0;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] numbers = {1,2,-3,4,-5};
		
		Arrays.sort(numbers);
		int value1 = 0;
		int value2 = 0;
		value1 = numbers[0]*numbers[1];
		value2 = numbers[numbers.length-1]*numbers[numbers.length-2];
		
        int answer = value1 > value2 ? value1 : value2;
        System.out.println(answer);
	}
}

