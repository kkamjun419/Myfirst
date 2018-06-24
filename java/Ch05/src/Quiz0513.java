
public class Quiz0513 {

	public static void main(String[] args) {
// 세로 
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++)
			System.out.print( i + "x" + j + "=" + (i * j));
			if(i < 10) {
				System.out.println();
				}
			}

		
//가로
		for (int i = 1; i < 10; i++) {
		for (int j = 2; j < 10; j++)
		System.out.print( j + "x" + i + "=" + (i * j));
		if(i < 10) {
			System.out.println();
			}
		}
	}
	}


