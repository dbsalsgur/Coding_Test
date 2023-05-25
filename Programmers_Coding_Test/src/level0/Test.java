package level0;

public class Test {

	public static void main(String[] args) {
		int[] num_list = {1,2,3,4,5,6,7,8};
		int n = 2;
		int k = 0;
		int[][] answer = new int[num_list.length/n][n];
		for (int i = 0; i < num_list.length/n; i++) {
			for (int j = 0; j < n; j++) {
				answer[i][j] = num_list[k++];
			}
		}
		for (int[] is : answer) {
			System.out.println(is);
		}
	}
}

