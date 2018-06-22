import java.util.Scanner;

public class Quiz05A02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num;
		double num1;
		System.out.println("평균을 구할 정수의 갯수를 입력하세요");
		num = s.nextInt();
		
		double sum = 0;
		for(int num2 = 0; num2 < num; num2++) {
			System.out.println("정수를 입력하세요");
			 num1 = s.nextInt();
			 sum = sum + num1;
			 }
	 System.out.println("평균값은" + sum / num +"입니다");
	}
}
