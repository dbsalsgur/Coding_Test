package level0;

public class CaseOfDividingBeads {

	public Long solution(int balls, int share) {
		Long numerator = 1L;
		Long denominator = 1L;
		
		for (int i = balls; i > share; i--) {
			numerator *= i;
			System.out.println(numerator);
		}
		for (int i = balls-share; i >= 1; i--) {
			denominator *= i;
			System.out.println(denominator);
		}
		
        Long answer = 0L;
        answer = numerator/denominator;
        return answer;
    }
}
