import java.util.Scanner;

public class Quiz0507 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			System.out.println("국어점수를 입력하세요");
		int nNum1 = s.nextInt();
		
		System.out.println("영어점수를 입력하세요");
			int nNum2 = s.nextInt();
		
		System.out.println("수학점수를 입력하세요");
			int nNum3 = s.nextInt();
		
		int nSum =  nNum1 + nNum2 + nNum3;
			System.out.println("평균점수는" + nSum / 3  );
		
		if ((nSum / 3) >= 90) 
		 
			System.out.println("학점은 A");
		
		else if((nSum / 3) >= 80) 
			System.out.println("학점은 b");	
		
		else if((nSum / 3) >= 70) 
			System.out.println("학점은 c");	
			
		else if((nSum / 3) >= 60) 
			System.out.println("학점은 d");
			
		else if((nSum / 3) >= 50)
			System.out.println("학점은 d");
			
		else 
		System.out.println("학점은 f");
		}		
	}


