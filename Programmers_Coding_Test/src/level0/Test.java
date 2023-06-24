package level0;

import java.lang.reflect.Array;

public class Test {

	public static void main(String[] args) {
		String s = "1 2 Z 3";
		
		String[] sumArray = s.split(" ");
		
		int answer = 0;
		for (int i = 0; i < sumArray.length; i++) {
			if (!sumArray[i].equals("Z")) {
				answer += Integer.parseInt(sumArray[i]);
				System.out.println(Integer.parseInt(sumArray[i]));
			} else {
				answer -= Integer.parseInt(sumArray[i-1]);
				System.out.println("a");
			}
		}
		System.out.println(answer);
	}
}

