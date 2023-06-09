package level0;

import java.util.LinkedList;

public class RemoveVowel {

	public String solution(String my_string) {
		char[] charArray = my_string.toCharArray();
		LinkedList list = new LinkedList();
		char[] afterArray = new char[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			list.add(i);
		}
		for (int i = 0; i  < charArray.length; i++) {
			if (list.get(i).equals('a')|| list.get(i).equals('e')|| 
				list.get(i).equals('i')|| list.get(i).equals('o')|| 
				list.get(i).equals('u')) {
				list.remove(i);
			}
		}
		String answer = "";
		for (char c : afterArray) {
			answer += c;
		}
        return answer;
    }
}
//문제 설명
//영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 문자열 my_string이 매개변수로 주어질 때 
//모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
//
//제한사항
//my_string은 소문자와 공백으로 이루어져 있습니다.
//1 ≤ my_string의 길이 ≤ 1,000
//
//입출력 예
//my_string				result
//"bus"					"bs"
//"nice to meet you"	"nc t mt y"