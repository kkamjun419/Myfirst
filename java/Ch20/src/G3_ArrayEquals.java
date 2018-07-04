import java.util.Arrays;

public class G3_ArrayEquals {
//매개변수 a와 a2로 전달된 배열의 내용을 비교하여 true 또는  false반환
	public static void main(String[] args) {
		int[] ar1 = {1,2,3,4,5};
		int[] ar2 = Arrays.copyOf(ar1, ar1.length);
		System.out.println(Arrays.equals(ar1,ar2));
	}

}
