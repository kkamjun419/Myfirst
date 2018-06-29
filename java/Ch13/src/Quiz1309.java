import java.util.Scanner;

public class Quiz1309 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int[] arr1 = new int[5];
		int[] arr2 = new int[4];
		{
			for (int i = 0; i < 5; i++) 
			{
				System.out.println("정수를 입력해주세요");
				arr1[i] = s.nextInt();
				
			}
			for (int i = 0; i < 4; i++)
			{
			
				if(arr1[i] > arr1[i+1])
				{
					arr2[i] = arr1[i];
					
					arr1[i+1] = arr1[i];
					
					System.out.print(arr1[i]);
				}
				else
				{
					arr2[i] = arr1[i+1];
					arr1[i] = arr1[i];
					System.out.print(arr1[i]);
				}
				
			}	
		}
	}
}
