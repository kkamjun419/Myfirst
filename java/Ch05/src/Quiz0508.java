import java.util.Scanner;

public class Quiz0508 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int nSum = 0;

		for (int nCount = 0; nCount < 5; nCount++) {
			System.out.println("������ �Է��ϼ���");
			int nNum1 = s.nextInt();
			{
				if (nNum1 < 1) {
					System.out.println("1�̻��� ������ �ٽ� �Է��ϼ���");
				} else {
					System.out.println("������ �Է��ϼ���");
					nSum = nSum + nNum1;
				}
			}
		}
		System.out.println("5�� ������ ����" + nSum + "�Դϴ�");
	}
}