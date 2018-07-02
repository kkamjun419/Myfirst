
public class C3_NullPointer {

	public static void main(String[] args) {
		String str = null;
		System.out.println(str); //null출력
		//if(str != null) {        //예외수정
		int len  = str.length(); //Exception!
		}
	}
//}
