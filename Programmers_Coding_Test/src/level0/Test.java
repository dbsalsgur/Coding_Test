package level0;

public class Test {

	public static void main(String[] args) {
		int n = 20;
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n%i == 0) {
				answer++;
			}
		}
		System.out.println(answer);
		
	}
}

