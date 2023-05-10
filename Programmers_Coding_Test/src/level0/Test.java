package level0;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		
		int[] emergency = {30, 10, 23, 6, 100};
		int[] sortEmergency = emergency.clone();
		
        int[] answer = new int[emergency.length];
        sort(sortEmergency);
        for (int i : sortEmergency) {
			System.out.println(i);
		}
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= answer.length; i++) {
			map.put(sortEmergency[answer.length-i], i);
		}
        for (int i = 0; i < answer.length; i++) {
			answer[i] = map.get(emergency[i]);
		}
        for (int i : answer) {
			System.out.println(i);
		}
    }
	
	public static void sort(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				for (int k : array) {
					System.out.print(k+", ");
				}
				System.out.println();
			}
		}

	}
}

