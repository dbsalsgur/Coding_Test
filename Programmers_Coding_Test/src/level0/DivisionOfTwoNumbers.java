package level0;

public class DivisionOfTwoNumbers {

	public int solution(double num1, double num2) {
        int answer = 0;

        double a = (num1/num2)*1000;
        answer = (int)a;
        return answer;
    }
	
}

//문제 설명
//정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
//
//제한사항
//0 < num1 ≤ 100
//0 < num2 ≤ 100
