import java.util.Scanner;

public class Quiz0504 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		{
		System.out.println("���ڸ� �Է��ϼ���");
		int x = s.nextInt();
	
		
		System.out.println("���ڸ� �Է��ϼ���");
		int y = s.nextInt();
			
		if( y > x) {
			System.out.println("�� ���� ���� " + (y - x));
			}
		else {
			System.out.println("�� ���� ���� " + (x - y));
			}		
			}
		}
}
