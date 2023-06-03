package level0;

public class Test {

	public static void main(String[] args) {
		int n = 15;
		
		int answer = 0;
        
        for (int i = 1; i <= 10; i++) {
        	int cnt = 0;
        	for (int j = 1; j <= n; j++) {
    			if (i%j == 0) {
    				cnt++;
    			}
    			System.out.println("cnt in for = "+cnt);
    		}
        	if (cnt >= 3) {
				answer++;
				System.out.println("cnt = "+cnt);
			}
        	cnt = 0;
        	System.out.println(i);
		}
        System.out.println(answer);
	}
}

