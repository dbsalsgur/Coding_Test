package level0;

public class Test {

	public static void main(String[] args) {
		int[][] board =  {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
		int[][] mineZone = new int[board.length+2][board.length+2];
		
		int answer = 0;
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == 0) {
					continue;
				} else {
					for (int k = (i-1)+1; k <= (i+1)+1 ; k++) {
						for (int l = (j-1)+1; l <= (j+1)+1; l++) {
							mineZone[k][l] = 1;
						}
					}
				}
			}
		}
        for (int i = 1; i < mineZone.length-1; i++) {
			for (int j = 1; j < mineZone.length-1; j++) {
				if (mineZone[i][j] == 1) {
					count++;
				}
			}
		}
		answer = board.length * board.length - count;
        System.out.println(answer);
	}
}

