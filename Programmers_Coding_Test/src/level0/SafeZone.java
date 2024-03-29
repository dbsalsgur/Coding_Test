package level0;

public class SafeZone {
	public int solution(int[][] board) {
		int[][] mineZone = new int[board.length][board.length];
		int answer = 0;
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == 0) {
					continue;
				} else {
					for (int k = i-1; k <= i+1 ; k++) {
						for (int l = j-1; l <= j+1; l++) {
							mineZone[k][l] = 1;
						}
					}
				}
			}
		}
        for (int i = 0; i < mineZone.length; i++) {
			for (int j = 0; j < mineZone.length; j++) {
				if (mineZone[i][j] == 1) {
					count++;
				}
			}
		}
		answer = board.length * board.length - count;
        return answer;
    }
}
//문제 설명
//다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
//image.png
//지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
//지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.
//
//제한사항
//board는 n * n 배열입니다.
//1 ≤ n ≤ 100
//지뢰는 1로 표시되어 있습니다.
//board에는 지뢰가 있는 지역 1과 지뢰가 없는 지역 0만 존재합니다.
//
//입출력 예
//board															result
//[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], 
//[0, 0, 1, 0, 0], [0, 0, 0, 0, 0]]								16
//[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], 
//[0, 0, 1, 1, 0], [0, 0, 0, 0, 0]]								13
//[[1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], 	
//[1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1]]	0