package level0;

public class Test {

	public static void main(String[] args) {
		String my_string = "rkawkaos";
		char[] str = my_string.toCharArray();
		String answer = "";
		for (int i = 0; i < str.length; i++) {
			answer += str[str.length-1-i];
		}
        System.out.println(answer);
	}
}

