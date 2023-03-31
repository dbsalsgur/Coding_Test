package level0;

import java.util.ArrayList;
import java.util.Iterator;

public class NoEvenNumber {

	public int[] solution(int n) {
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
        return answer;
    }
}

//문제 설명
//정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
//
//제한사항
//1 ≤ n ≤ 100
