package level0;

import java.util.HashMap;
import java.util.Map;

public class MorseCode {

	public String solution(String letter) {
		Map<String, String> decode = new HashMap<>();
		decode.put(".-", "a");
		decode.put("-...", "b");
		decode.put("-.-.", "c");
		decode.put("-..", "d");
		decode.put(".", "e");
		decode.put("..-.", "f");
		decode.put("--.", "g");
		decode.put("....", "h");
		decode.put("..", "i");
		decode.put(".---", "j");
		decode.put("-.-", "k");
		decode.put(".-..", "l");
		decode.put("--", "m");
		decode.put("-.", "n");
		decode.put("---", "o");
		decode.put(".--.", "p");
		decode.put("--.-", "q");
		decode.put(".-.", "r");
		decode.put("...", "s");
		decode.put("-", "t");
		decode.put("..-", "u");
		decode.put("...-", "v");
		decode.put(".--", "w");
		decode.put("-..-", "x");
		decode.put("-.--", "y");
		decode.put("--..", "z");
		
		String[] array = letter.split(" ");
		
		String answer = "";
		
		for (int i = 0; i < array.length; i++) {
			answer += decode.get(array[i]);
		}
        
        return answer;
    }
}
//문제 설명
//머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다. 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다. 문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
//모스부호는 다음과 같습니다.
//
//morse = { 
//    '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
//    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
//    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
//    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
//    '-.--':'y','--..':'z'
//}
//제한사항
//1 ≤ letter의 길이 ≤ 1,000
//return값은 소문자입니다.
//letter의 모스부호는 공백으로 나누어져 있습니다.
//letter에 공백은 연속으로 두 개 이상 존재하지 않습니다.
//해독할 수 없는 편지는 주어지지 않습니다.
//편지의 시작과 끝에는 공백이 없습니다.