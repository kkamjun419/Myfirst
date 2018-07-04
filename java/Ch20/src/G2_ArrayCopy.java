
public class G2_ArrayCopy {

	public static void main(String[] args) {
		double[] org = {1.1, 2.2, 3.3, 4.4, 5.5};
		double[] cpy = new double[3];
		
		//미리 만들어져 있는 배열에 복사한다
		//배열 org의 인덱스 1에서 배열 cpy인덱스 0 으로 세개의 요소 복사
		System.arraycopy(org, 1, cpy, 0, 3);
		
		for(double d : cpy)
			System.out.print(d +"\t" );
		System.out.println();
	}

}
