import java.util.InputMismatchException;
import java.util.Scanner;

public class A4_ExceptionCase4 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		try {
		System.out.println("a/b...a?");
		int n1 = kb.nextInt(); // int 형 정수 입력

		System.out.println("a/b...b?");
		int n2 = kb.nextInt();

		System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2);
		}
		
		catch(ArithmeticException e) 
		{
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) 
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Good bye~~~!!!");
	}

}
