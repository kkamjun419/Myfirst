
public class Quiz1310 {
	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		addPrint(arr);

		for (int k = 0; k < 4; k++) {
			int[][] arr2 = new int[4][4];
			int x;
			int y;
			y = 0;
			for (int i = 0; i < 4; i++) {
				x = 3;
				for (int j = 0; j < 4; j++) {
					arr2[i][j] = arr[x][y];
					x--;
				}
				y++;
			}

			// 원래 배열에 값을 다시 복사
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					arr[i][j] = arr2[i][j];
				}
			}
			addPrint(arr2);

		}
	}

	public static void addPrint(int[][] arr) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
