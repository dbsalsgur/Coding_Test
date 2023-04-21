package level0;

public class ReverseString {

	public String solution(String my_string) {
		char[] str = my_string.toCharArray();
		String answer = "";
		for (int i = 0; i < str.length; i++) {
			answer += str[str.length-1-i];
		}
        return answer;
    }
	
}
//문제 설명
//문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
//
//제한사항
//1 ≤ my_string의 길이 ≤ 1,000

