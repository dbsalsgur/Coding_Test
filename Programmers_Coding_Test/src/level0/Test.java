package level0;

public class Test {

	public static void main(String[] args) {
		String my_string = "nice to meet you";
		
		String answer = my_string;
		String[] vowels = {"a", "e", "i", "o", "u"};
		for (String string : vowels) {
			answer = answer.replaceAll(string, "");
		}
        System.out.println(answer);
	}
}

