import java.util.Random;

public class E1_SeedSetRandom 
{
	public static void main(String[] args) //실행때마다 다른 결과를 보인다.
	{
		Random rand = new Random();
		for(int i= 0; i < 7; i++ )
			System.out.println(rand.nextInt(1000));
	}
	
}
