package level0;


public class Test {

	public static void main(String[] args) {
		int[][] dots = {{1,1}, {2,1}, {2,2}, {1,2}};
		
		int answer = (dots[1][0]-dots[0][0])*(dots[2][1]-dots[1][1]);
		if (answer < 0) {
			answer *= -1;
		}
		System.out.println(dots[1][0]);
		System.out.println(dots[0][0]);
		System.out.println(dots[1][1]);
		System.out.println(dots[0][1]);
		System.out.println(answer);
	}
}

