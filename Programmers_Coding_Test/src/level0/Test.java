package level0;

import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		int n = 6561;
		int m = n;
		List list = new LinkedList();
		
		for (int i = 0; i < n; i++) {
			for (int j = 2; j <= n; j++) {
				if (m%j == 0) {
					m = m/j;
					list.add(j);
					break;
				}
			}
		}
		
		for (int i = 1; i < list.size(); i++) {
			try {
				while (list.get(i).equals(list.get(i-1))) {
					list.remove(i);
				}
			} catch (IndexOutOfBoundsException e) {
				break;
			}
			
		}
		
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++){
			answer[i] = (int)list.get(i);
		}
		
		for (int k : answer) {
	        System.out.println(k);
		}
		System.out.println(list);
	}
}

