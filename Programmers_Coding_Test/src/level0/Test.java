package level0;

public class Test {

	public static void main(String[] args) {
		int n = 7;
		
		int answer = 0;
		int temp = 1;
		for (int i = 1; true; i++) {
			temp *= i;
			if (temp >= n) {
				break;
			}
			System.out.println("temp = "+temp);
			answer++;
			System.out.println(answer);
		}
        System.out.println(answer);
	}
}

