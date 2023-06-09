package level0;

public class SharingPizza2 {

	public int solution(int n) {
		int temp = 0;
		int answer = 0;
		if (n%6 == 0) {
			answer = n/6;
		} else {
			for (int i = 1; i <= n*6; i++) {
				if (i%n == 0 && i%6 == 0) {
					temp = i;
					break;
				}
			}
			answer = temp/6;
		}
        return answer;
    }
}
//문제 설명
//머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
//
//제한사항
//1 ≤ n ≤ 100