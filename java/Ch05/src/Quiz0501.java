import java.util.Scanner;

public class Quiz0501 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		int num;
		int num1 = 0;
		
		do { 
			System.out.println("숫자를 입력하세요.");
			num = s.nextInt();
			num1 = (num + num1);		
			}
		while(num != 0);
		
		System.out.println(num1);
	
		}	
			
		
			
	}
		


		


	