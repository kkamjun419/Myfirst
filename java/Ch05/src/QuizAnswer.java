import java.util.Scanner;

public class QuizAnswer {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		
		int nCount = s.nextInt();
		float nSum = 0;
		
		for (int i = 0; i < nCount; i++) {
			System.out.println("���ڸ� �Է��ϼ���.");
			int nInputNum = s.nextInt();
			nSum = nSum + nInputNum;
		}
		System.out.println(nSum / nCount);
	}

}
