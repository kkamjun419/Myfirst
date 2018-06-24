
public class quiz0512 {

	public static void main(String[] args) {
		int nSum = 0;
		int nNum = 1;
		do {
			nSum = nSum + nNum;
			System.out.print(nNum);{
			if(nNum >= 1000)
				break;}
			System.out.print("+");
			nNum++;
			
		} while (nNum <= 1000);
		System.out.println("="+ nSum);
	}

}
