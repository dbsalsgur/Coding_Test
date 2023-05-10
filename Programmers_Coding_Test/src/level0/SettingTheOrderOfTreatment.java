package level0;

import java.util.HashMap;

public class SettingTheOrderOfTreatment {

	public int[] solution(int[] emergency) {
		
		int[] sortEmergency = emergency;
		
        int[] answer = new int[emergency.length];
        sort(sortEmergency);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= answer.length; i++) {
			map.put(emergency[i], i);
		}
        for (int i = 0; i < answer.length; i++) {
			answer[i] = map.get(emergency[i]);
		}
        return answer;
    }
	
	public void sort(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if (array[i] > array[i+1]) {
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		}

	}
}
