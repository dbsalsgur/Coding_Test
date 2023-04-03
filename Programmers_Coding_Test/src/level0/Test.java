package level0;

public class Test {

	public static void main(String[] args) {
		int n = 10;
		int temp = 0;
		int answer = 0;
		if (n%6 == 0) {
			answer = n/6;
		} else {
			for (int i = 1; i <= n*6; i++) {
				if (i%n == 0 && i%6 == 0) {
					temp = i;
					break;
				}
			}
		}
		answer = temp/6;
		System.out.println(answer);
	}
}

