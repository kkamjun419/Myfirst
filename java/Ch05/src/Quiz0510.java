import java.util.Scanner;

public class Quiz0510 {

	public static void main(String[] args) {

		int nSum = 0;
		int nSum2 = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int nNum1 = s.nextInt();

		System.out.println("������ �Է��ϼ���");
		int nNum2 = s.nextInt();

		if (nNum1 < nNum2) {
			do {
				System.out.println(nSum = nNum1 + nSum);
				nNum1++;
			} while (nNum1 <= nNum2);
		}
		else {
			do {
				System.out.println(nSum2 = nNum1 + nSum2);
				nNum1--;
			} while (nNum1 >= nNum2);
			
		}
	}
}
