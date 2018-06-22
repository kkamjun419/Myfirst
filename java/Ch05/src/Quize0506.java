import java.util.Scanner;

public class Quize0506 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		{
		System.out.println("역순 출력할 구구단의 정수를 입력하세요");
		int nNum1 = s.nextInt();
		for(int i =  nNum1; i <= nNum1; i++)
		{
		for(int j = 9; j >= 1; j--)
			System.out.println(i + "x" + j + "=" + (i*j));
		}
		}
	}
}