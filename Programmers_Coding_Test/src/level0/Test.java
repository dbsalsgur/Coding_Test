package level0;


public class Test {

	public static void main(String[] args) {
		String[] keyinput = {"left", "right", "up", "right", "right"};
		int[] board = {1, 11};
		
		int[] answer = {0,0};
        int maxX = (board[0]-1)/2;
        int maxY = (board[1]-1)/2;
        for (int i = 0; i < keyinput.length; i++) {
			if (keyinput[i].equals("up")) {
				answer[1]++;
			} else if(keyinput[i].equals("down")){
				answer[1]--;
			} else if(keyinput[i].equals("left")){
				answer[0]--;
			} else if(keyinput[i].equals("right")){
				answer[0]++;
			}
		}
        
        if (answer[1] > maxY) {
			 answer[1] = maxY;
		}
        if(answer[1] < -maxY) {
			answer[1] = -maxY;
		}
        if(answer[0] < -maxX) {
			answer[0] = -maxX;
		}
        if (answer[0] > maxX) {
			answer[0] = maxX;
		}
        
        for (int i : answer) {
			System.out.println(i);
		}
	}
}

