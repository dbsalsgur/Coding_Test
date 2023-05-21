package level0;

public class CaseOfDividingBeads {

	public Long solution(int balls, int share) {
		Long numerator = 1L;
		Long denominator = 1L;
        int j = balls-share;
		
		for (int i = balls; i > share; i--) {
			numerator *= i;
            if (numerator%j == 0) {
				numerator /= j;
			} else {
				denominator *= j;
			}
			j--;
		}
		
		
        Long answer = 0L;
        answer = numerator/denominator;
        return answer;
    }
}
//문제 설명
//머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다. 
//머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, 
//balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
//
//제한사항
//1 ≤ balls ≤ 30
//1 ≤ share ≤ 30
//구슬을 고르는 순서는 고려하지 않습니다.
//share ≤ balls
