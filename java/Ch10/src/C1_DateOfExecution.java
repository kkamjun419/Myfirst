import java.time.LocalDate;

class C1_DateOfExecution {

	static String date;
	
	//인스턴스 생성과 관계없이 static 변수가 메모리 공간에 
	//할당될 때 실행이 된다.
	static {
		LocalDate nDate = LocalDate.now();
		date = nDate.toString();
	}

	public static void main(String[] args) {
		System.out.println(date);
	}
}
