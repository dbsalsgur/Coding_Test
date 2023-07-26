package level0;

public class Test {

	public static void main(String[] args) {
		int[] sides = {11, 7};
		
		int answer = 0;
        int a = Math.max(sides[0], sides[1]);
        int b = Math.min(sides[0], sides[1]);
        for (int i = 0; i <= a-b; i++) {
			answer++;
		}
        for (int i = 0; i <= a+b; i++) {
			if (i >= a) {
				answer++;
			}
		}
        System.out.println(answer);
	}
}

