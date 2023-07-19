package level0;

public class Test {

	public static void main(String[] args) {
		String polynomial =  "5x + x + 7 + 2x + 6";
		
		String[] temp = polynomial.split(" ");
		String variable = "";
		int constant = 0;
		for (int i = 0; i < temp.length; i++) {
			boolean judge = temp[i].contains("x");
			if (judge) {
				variable += temp[i];
			} else if(temp[i].contains("+")){
				continue;
			} else {
				constant += Integer.parseInt(temp[i]);
			}
		}
		
		String[] temp2 = variable.split("");
		int countX = 0;
		int coefficient = 0;
		for (int i = 0; i < temp2.length; i++) {
			if (temp2[i].equals("x")) {
				countX++;
			} else {
				coefficient = coefficient + Integer.parseInt(temp2[i]) - 1;
			}
		}
		coefficient = coefficient + countX; 
		
		
        String answer = "";
        if (constant == 0) {
			answer = coefficient + "x";
		} else {
			answer = coefficient + "x" + " + " + constant;
		}
        
        System.out.println(answer);
	}
}

