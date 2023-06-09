package level0;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		String my_string = "bus";
		
		char[] charArray = my_string.toCharArray();
		LinkedList list = new LinkedList();
		char[] afterArray = new char[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			list.add(i);
			System.out.println(list.get(i));
		}
		for (int i = 0; i  < charArray.length; i++) {
			if (list.get(i).equals('a')|| list.get(i).equals('e')|| 
				list.get(i).equals('i')|| list.get(i).equals('o')|| 
				list.get(i).equals('u')) {
				list.remove(i);
			}
		}
		for (int i = 0; i < afterArray.length; i++) {
			afterArray[i] = (char)list.get(i);
		}
		String answer = "";
		for (char c : afterArray) {
			System.out.println(c);
			answer += c;
		}
        System.out.println(answer);
	}
}

