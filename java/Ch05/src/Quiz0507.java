import java.util.Scanner;

public class Quiz0507 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			System.out.println("���������� �Է��ϼ���");
		int nNum1 = s.nextInt();
		
		System.out.println("���������� �Է��ϼ���");
			int nNum2 = s.nextInt();
		
		System.out.println("���������� �Է��ϼ���");
			int nNum3 = s.nextInt();
		
		int nSum =  nNum1 + nNum2 + nNum3;
			System.out.println("���������" + nSum / 3  );
		
		if ((nSum / 3) >= 90) 
		 
			System.out.println("������ A");
		
		else if((nSum / 3) >= 80) 
			System.out.println("������ b");	
		
		else if((nSum / 3) >= 70) 
			System.out.println("������ c");	
			
		else if((nSum / 3) >= 60) 
			System.out.println("������ d");
			
		else if((nSum / 3) >= 50)
			System.out.println("������ d");
			
		else 
		System.out.println("������ f");
		}		
	}


