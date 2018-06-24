import java.util.Scanner;

public class Quiz0508 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int nSum = 0;

		for (int nCount = 0; nCount < 5; nCount++) {
			System.out.println("정수를 입력하세요");
			int nNum1 = s.nextInt();
			{
				if (nNum1 < 1) {
					System.out.println("1이상의 정수로 다시 입력하세요");
				} else {
					System.out.println("정수를 입력하세요");
					nSum = nSum + nNum1;
				}
			}
		}
		System.out.println("5개 정수의 합은" + nSum + "입니다");
	}
}