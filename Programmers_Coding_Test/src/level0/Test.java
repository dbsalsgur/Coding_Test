package level0;

public class Test {

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		
		String regex = "[a-zA-Z]";
		my_string = my_string.replaceAll(regex, "");
		
		int[] num = new int[my_string.length()];
		for (int i = 0; i < num.length; i++) {
			num[i] = my_string.charAt(i) - '0';
		}
		
        int answer = 0;
        for (int i : num) {
			answer += i;
		}
        System.out.println(answer);
	}
}

