package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		int n = 15;
		int size = 0;
		if (n%2 == 0) {
			size = n/2;
		} else {
			size = n/2+1;
		}
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i%2 == 0) {
				continue;
			}
			numbers.add(i);
		}
		int[] answer = new int[size];
		Iterator it = numbers.iterator();
		int j = 0;
		while (it.hasNext()) {
			answer[j] = (int)it.next();
			j++;
		}
		System.out.println(Arrays.toString(answer));
	}
}

