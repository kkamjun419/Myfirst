import java.util.Scanner;

public class Quiz05A02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num;
		double num1;
		System.out.println("����� ���� ������ ������ �Է��ϼ���");
		num = s.nextInt();
		
		double sum = 0;
		for(int num2 = 0; num2 < num; num2++) {
			System.out.println("������ �Է��ϼ���");
			 num1 = s.nextInt();
			 sum = sum + num1;
			 }
	 System.out.println("��հ���" + sum / num +"�Դϴ�");
	}
}
