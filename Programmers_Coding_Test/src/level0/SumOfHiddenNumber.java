package level0;

public class SumOfHiddenNumber {
	public int solution(String my_string) {
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
        return answer;
    }
}
//문제 설명
//문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
//
//제한사항
//1 ≤ my_string의 길이 ≤ 1,000
//my_string은 소문자, 대문자 그리고 한자리 자연수로만 구성되어있습니다.

//입출력 예
//my_string			result
//"aAb1B2cC34oOp"	10
//"1a2b3c4d123"		16