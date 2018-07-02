import java.util.Scanner;

public class A2_ExceptionCase2 {

	public static void main(String[] args) {

		try {
		Scanner kb = new Scanner(System.in);

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
		System.out.println("Good bye~~~!!!");
		
	}

}
