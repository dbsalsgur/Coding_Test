package level0;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		String my_string = "hi12392";
		Pattern pattern = Pattern.compile("^[0-9]*");
		String matched_num = "";
		
		Matcher matcher = pattern.matcher(my_string);
		
		while (matcher.find()) {
			matched_num += matcher.group();
			System.out.println(matcher.group());
		}
		System.out.println(matched_num);
        int[] answer = new int[matched_num.length()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = matched_num.charAt(i) - '0';
		}
        for (int i : answer) {
			System.out.println(i);
		}
	}
}

