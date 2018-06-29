//가로가 9, 세로가 3인 int형 2차원 배열을 선언하여 구구단 중 2, 3, 4단을 저장한다.
//그리고 제대로 저장이 되었는지 확인하기 위해 출력을 하는 프로그램을 작성하라

public class Quiz1306 {

	public static void main(String[] args) {
		int [][] arr = new int [3][9];
		int num = 0;   
		
		//배열에 값을 저장 
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				num = (i+2)*(j+1);
				arr[i][j] = num;
			}
		}
		
		//배열에 저장된 값을 출력
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j< 9; j++) {
				System.out.print((i+2) +"x"+ (j+1) +"=" + arr[i][j] +"\t");
			}
			System.out.println();
		}
	}
}
