package level0;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		int n = 420;
		
		ArrayList list = new ArrayList();
		for (int i = 0; i < n; i++) {
			for (int j = 2; j <= n; j++) {
				int cnt = 0;
				for (int k = 0; k < n; k++) {
					if (n%j == 0) {
						cnt++;
					}
				}
				if (!(cnt == 2)) {
					break;
				}
				if (n%j == 0) {
					list.add(j);
					break;
				}
			}
		}
		
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = (int)list.get(i);
		}
		
		for (int i : answer) {
	        System.out.println(i);
		}
	}
}

