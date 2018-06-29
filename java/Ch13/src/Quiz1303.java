
//길이가 10인 배열을 선언하고 총 10개의 정수를 입력받아서 홀수와 짝수를
//구분해서 출력하라.

import java.util.Scanner;

public class Quiz1303 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int i = 0;
		{
			for (i = 0; i < arr.length; i++) 
			{
				Scanner s = new Scanner(System.in);
				System.out.println("정수를 입력하세요");
				arr[i] = s.nextInt();
			}
			System.out.print("홀수 :");
			for (i = 0; i < arr.length; i++)
				if(arr[i] % 2 == 1)
				System.out.print(arr[i]);
			
			System.out.println();
			
			System.out.print("짝수 :");	
			for (i = 0; i < arr.length; i++)
				if(arr[i] % 2 == 0)
				System.out.print(arr[i]);
			}

		}

	}

