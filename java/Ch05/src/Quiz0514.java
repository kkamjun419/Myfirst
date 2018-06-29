
public class Quiz0514 {

	public static void main(String[] args) {
		//  AZ
		// +ZA
		// ---
		//  99
		//  A*10 +Z
		//  Z*10 +Z
		for (int i=0; i<10; i++)
		{
			//System.out.print(i*10 + " ");
			for (int j=0; j<10; j++)
			{
				if (((i*10 +j) + (j*10 +i)) == 99)
				{
					System.out.println(i + " " + j);
					System.out.println(j + " " + i);
					System.out.println("-----------");
				}
			}
		}
	}
}