package level0;

public class Test {

	public static void main(String[] args) {
		
		int balls = 30;
		int share = 5;
		
		Long numerator = 1L;
		Long denominator = 1L;
		
		for (int i = balls; i > share; i--) {
			numerator *= i;
			System.out.println("numer="+numerator);
		}
		for (int i = balls-share; i >= 1; i--) {
			denominator *= i;
			System.out.println("deno="+denominator);
		}
//        int nFac = 1;
//        int mFac = 1;
//        int lFac = 1;
//        for (int i = 1; i <= balls; i++) {
//			nFac *= i;
//		}
//        System.out.println("nFac= "+nFac);
//        for (int i = 1; i <= share; i++) {
//			mFac *= i;
//		}
//        System.out.println("mFac= "+mFac);
//        for (int i = 1; i <= balls-share; i++) {
//			lFac *= i;
//		}
//        System.out.println("lFac= "+lFac);
		
        Long answer = 0L;
//        answer = nFac/(lFac*mFac);
        answer = numerator/denominator;
        System.out.println(answer);
	}
}

