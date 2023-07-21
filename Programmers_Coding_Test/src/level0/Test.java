package level0;

public class Test {

	public static void main(String[] args) {
		String my_string =  "aAb1B2cC34oOp";
		
		int answer = 0;
		String[] array = my_string.split("[a-zA-Z]");
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("")) {
				continue;
			} else {
				count++;
			}
		}
		
		int[] numbers = new int[count];
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("")) {
				System.out.println(1);
				continue;
			} else {
				numbers[j] = Integer.parseInt(array[i]+"");
				System.out.println("value = "+"'"+numbers[j]+"'");
				j++;
			}
		}
		
		for (int k = 0; k < numbers.length; k++) {
			answer += numbers[k];
		}
        
        System.out.println(answer);
	}
}

