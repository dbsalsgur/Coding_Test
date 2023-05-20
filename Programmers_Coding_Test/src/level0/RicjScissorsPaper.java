package level0;

public class RicjScissorsPaper {

	public String solution(String rsp) {
		String[] rspArray = rsp.split("");
		for (int i = 0; i < rspArray.length; i++) {
			System.out.println("a");
			if (rspArray[i].equals("0")) {
				rspArray[i] = "5";
			} else if(rspArray[i].equals("2")){
				rspArray[i] = "0";
			} else if(rspArray[i].equals("5")) {
				rspArray[i] = "2";
			}
		}
        String answer = "";
        for (int i = 0; i < rspArray.length; i++) {
			answer += rspArray[i];
		}
        return answer;
    }
}
