package level0;


public class Test {

	public static void main(String[] args) {
		
		int age = 100;
		
		char[] key = new char[10];
		char j = 'a';
		for (int i = 0; i < key.length; i++) {
			key[i] = j;
			j++;
		}
		int single = age%10;
		int decimal = (age-single)%100/10;
		int hundredth = (age-decimal-single)%1000/1000;
		
		System.out.println(hundredth);
		
        String answer = String.valueOf(key[hundredth]) + String.valueOf(key[decimal]) + String.valueOf(key[single]);
		if(age < 10) {
			answer = String.valueOf(key[single]);
		} else if(age < 100) {
			answer = String.valueOf(key[decimal]) + String.valueOf(key[single]);
		} else if(age == 1000) {
			answer = "baaa";
		}
        
        System.out.println(answer);
    }
}

