package level0;

import java.util.ArrayList;

public class Factoration {
	public int[] solution(int n) {
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
        
        return answer;
    }
}
//문제 설명
//소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다. 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다. 
//따라서 12의 소인수는 2와 3입니다. 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
//
//제한사항
//2 ≤ n ≤ 10,000
//
//입출력 예
//n	result
//12	[2, 3]
//17	[17]
//420	[2, 3, 5, 7]