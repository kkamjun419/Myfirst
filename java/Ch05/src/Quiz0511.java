import java.util.Scanner;

public class Quiz0511 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int nNum1 = s.nextInt();
		int fNum = 1;

		while (nNum1 >= 1) {
			fNum = nNum1 * fNum;
			nNum1--;
		}
		System.out.println(fNum);
	}

}
