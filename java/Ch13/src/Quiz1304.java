import java.util.Scanner;

//길이가 10인 배열을 선언한후 총 10개의 정수를 입력받는다.
//단 홀수는 배열의 앞에서 부터 채워나가고 짝수는 배열의 끝에서부터 채워나간다.
//출력예시) 총 10개의 정수를 입력하시오.
//1 2 3 4 5 6 7 8 9 10결과 : 1 3 5 7 9 10 8 6 4 2

public class Quiz1304 {
	//
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// int[] arr = new int[10];
		// int i = 0;
		//
		// for (i = 0; i < arr.length; i++) {
		// System.out.println("정수를 입력하세요");
		// arr[i] = s.nextInt();
		// }
		//
		// for (i = 0; i < arr.length; i++) {
		// System.out.print(arr[i]);
		// }
		//
		// System.out.print("결과");
		//
		// for (i = 0; i < arr.length; i++) {
		// if (arr[i] % 2 == 1)
		// System.out.print(arr[i]);
		// }
		//
		// for (i = 9; i >= arr.length - 9; i--) {
		// if (arr[i] % 2 == 0)
		//
		// System.out.print(arr[i]);
		//
		// }
		int[] num = new int[10];

		int oddCnt = 0;
		int evenCnt = 9;
		for (int i = 0; i < num.length; i++) {
			System.out.println("숫자를 입력하세요");
			int nTmp = s.nextInt();
			if (nTmp % 2 == 0) {
				num[evenCnt] = nTmp;
				evenCnt--;
			} else {
				num[oddCnt] = nTmp;
				oddCnt++;
			}
		}
		
		for(int i=0; i <num.length; i++)
		{
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
}
