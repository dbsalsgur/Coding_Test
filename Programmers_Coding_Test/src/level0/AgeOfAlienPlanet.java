package level0;

public class AgeOfAlienPlanet {

	public String solution(int age) {
		char[] key = new char[10];
		char j = 'a';
		for (int i = 0; i < key.length; i++) {
			key[i] = j;
			j++;
		}
		int single = age%10;
		int decimal = (age-single)%100/10;
		int hundredth = (age-decimal-single)%1000/100;
		
        String answer = String.valueOf(key[hundredth]) + String.valueOf(key[decimal]) + String.valueOf(key[single]);
		if(age < 10) {
			answer = String.valueOf(key[single]);
		} else if(age < 100) {
			answer = String.valueOf(key[decimal]) + String.valueOf(key[single]);
		} else if(age == 1000) {
			answer = "baaa";
		}
        return answer;
    }
}
//문제 설명
//우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다. 입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다. a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다. 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
//
//제한사항
//age는 자연수입니다.
//age ≤ 1,000
//PROGRAMMERS-962 행성은 알파벳 소문자만 사용합니다.
