import java.util.Scanner;

public class Quiz0504 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		{
		System.out.println("숫자를 입력하세요");
		int x = s.nextInt();
	
		
		System.out.println("숫자를 입력하세요");
		int y = s.nextInt();
			
		if( y > x) {
			System.out.println("두 수의 차는 " + (y - x));
			}
		else {
			System.out.println("두 수의 차는 " + (x - y));
			}		
			}
		}
}
