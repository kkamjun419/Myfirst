import java.util.Scanner;

public class Quize0506 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		{
		System.out.println("���� ����� �������� ������ �Է��ϼ���");
		int nNum1 = s.nextInt();
		for(int i =  nNum1; i <= nNum1; i++)
		{
		for(int j = 9; j >= 1; j--)
			System.out.println(i + "x" + j + "=" + (i*j));
		}
		}
	}
}