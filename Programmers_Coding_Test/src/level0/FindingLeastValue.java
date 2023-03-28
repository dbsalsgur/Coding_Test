package level0;

import java.util.Arrays;

public class FindingLeastValue {

	public int solution(int[] array) {
		Arrays.sort(array);
		int[] count = new int[100];
		for (int i = 0; i < array.length; i++) {
			int j = 0;
			int a = 0;
			count[j] = 1;
			while(array[a] == array[a+1]) { 
				count[j]++;
				a++;
			}
			if(array[i] != array[i+1]) {
				j++;
			}
		}
		Arrays.sort(count);
        int answer = count[count.length-1];
        if (count.length-1 == count.length-2) {
			answer = -1;
		}
        return answer;
    }
}

//문제 설명
//최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 
//최빈값이 여러 개면 -1을 return 합니다.
//
//제한사항
//0 < array의 길이 < 100
//0 ≤ array의 원소 < 1000