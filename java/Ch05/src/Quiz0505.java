
public class Quiz0505 {

	public static void main(String[] args) 
	{
		for (int nNum1 = 2; nNum1 < 10; nNum1++)
			for( int nNum2 = 1; nNum2 <= nNum1; nNum2++)
			if ((nNum1 % 2) == 0) 
			{
			System.out.println(nNum1 + "x" + nNum2 + "=" + (nNum1*nNum2) );
			}
		}
	}
	


