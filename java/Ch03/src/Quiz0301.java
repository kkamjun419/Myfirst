import java.util.Scanner;

public class Quiz0301 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("ù ��° ���ڸ� �Է��ϼ���");
		
		int num1 = s.nextInt();
		
		System.out.println("�� ��° ���ڸ� �Է��ϼ���");
		
		int num2 = s.nextInt();
		
		System.out.println("����� �Է��� ���ڴ� " + num1 + "," + num2);

		System.out.println("�� ������ ���� " + (num1 + num2));
		System.out.println("�� ������ ����" + (num1 - num2));
		System.out.println("�� ������ ����" + (num1 * num2));
		System.out.println("�� ������ ��������" + (num1 / num2));
	}

}
