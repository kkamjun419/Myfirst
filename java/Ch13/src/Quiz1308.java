import java.util.Scanner;

public class Quiz1308 
{
	public static void main(String[] args) 
	{
		int [][] nScore = new int[4][6];
		int hsum = 0;
		int[] vsum = new int[4];
		
		Scanner s = new Scanner(System.in);
		
		for (int i=0; i < 4; i++) {
			switch (i) {
			case 0:
				System.out.println("4명의 국어점수 입력");
				break;
			case 1:
				System.out.println("4명의 영어점수 입력");
				break;
			case 2:
				System.out.println("4명의 수학점수 입력");
				break;
			case 3:
				System.out.println("4명의 국사점수 입력");
				break;
			default:
				break;
			}
			for(int j = 0; j < 4; j++) {
				nScore[i][j] = s.nextInt();
			}
		}
			System.out.println();
			
			System.out.println("구분\t이순신\t강감찬\t을지문덕\t권율\t총점");
			for(int i = 0; i<4; i++) {
				switch(i) {
				case 0:
					System.out.print("국어:\t");
					break;
				case 1:
					System.out.print("영어:\t");
					break;
				case 2:
					System.out.print("수학:\t");
					break;
				case 3:
					System.out.print("국사:\t");
					break;
				default:
					break;
				}
				hsum = 0;
				for(int j = 0; j < 4; j++) 
				{
					System.out.print(nScore[i][j] + "\t");
					hsum = hsum + nScore[i][j];
					vsum[i] = vsum[i] + nScore[j][i];
				}
				System.out.println(hsum);
			}
			System.out.print("총점\t" + vsum[0] + "\t"+ vsum[1] + "\t" + vsum[2] + "\t" + vsum[3] + "\t" );
		}
	}
