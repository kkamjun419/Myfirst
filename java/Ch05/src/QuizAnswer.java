import java.util.Scanner;

public class QuizAnswer {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		int nCount = s.nextInt();
		float nSum = 0;
		
		for (int i = 0; i < nCount; i++) {
			System.out.println("숫자를 입력하세요.");
			int nInputNum = s.nextInt();
			nSum = nSum + nInputNum;
		}
		System.out.println(nSum / nCount);
	}

}
