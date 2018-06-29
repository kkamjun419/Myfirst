//길이가 5인 int형 배열을 선언해서 사용자로부터 5개의 정수를 입력받는다.	
//그리고 최대값, 최소값, 모든 수의 합을 구하라. 함수(최대,최소,합)를 정의하여 구현하시오.
//클래스를 만들 경우 배열을 인자로 넘기기
//메인에서 다 처리해도 됨


import java.util.Scanner;

public class Quiz1301 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] ar = new int [5];
		
		System.out.println("정수를 입력하세요");
		int x = s.nextInt();
		
		System.out.println("정수를 입력하세요");
		int x1 = s.nextInt();
		
		System.out.println("정수를 입력하세요");
		int x2 = s.nextInt();
		
		System.out.println("정수를 입력하세요");
		int x3 = s.nextInt();
		
		System.out.println("정수를 입력하세요");
		int x4 = s.nextInt();
		
		ar[0] = x;
		ar[1] = x1;
		ar[2] = x2;
		ar[3] = x3;
		ar[4] = x4;
			
		int sum = 0;
		int	min = ar[0];
		int max = ar[0]; 
		
		for(int i = 0; i < ar.length; i++)
			if (max < ar[i])
			{
			max = ar[i];
			}
		
			System.out.println("최대값:"+ max);
				
		for(int i = 0; i < ar.length; i++)
			if (min > ar[i])
			{
				min = ar[i];
			}
				System.out.println("최소값은 :" + min);
		
		for(int i = 0; i < ar.length; i++)
			sum += ar[i];
		
		System.out.println("총합은 :" + sum);
		
		
	}

}
