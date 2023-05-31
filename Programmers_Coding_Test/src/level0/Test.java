package level0;

public class Test {

	public static void main(String[] args) {
		int[] numbers = {1,2,3};
		int k = 3;
		
		System.out.println(numbers[((k-1)*2)%numbers.length]);
	}
}

