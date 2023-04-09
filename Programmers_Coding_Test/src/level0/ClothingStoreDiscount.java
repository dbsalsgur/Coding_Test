package level0;

public class ClothingStoreDiscount {

	public int solution(int price) {
	    int answer = 0;
	    int discount = 0;
	    if (price>=100000 && price<300000) {
			discount = price/20;
            if(price%20 != 0) {
                discount++;
            }
		} else if(price>=300000 && price<500000){
			discount = price/10;
		} else if(price>=500000){
			discount = price/5;
		} else {
            discount = 0;
        }
	    answer = price - discount;
	    return answer;
	}
}
//문제 설명
//머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
//구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
//
//제한사항
//10 ≤ price ≤ 1,000,000
//price는 10원 단위로(1의 자리가 0) 주어집니다.
//소수점 이하를 버린 정수를 return합니다.
//
//왠만하면 할인 값을 빼는게 아니라 price에 0.8, 0.9, 0.95를 곱해서 값을 구하는게 정확함.