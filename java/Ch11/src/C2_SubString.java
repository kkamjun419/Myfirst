//문자열의 일부 추출

class C2_SubString {
	public static void main(String[] args) {
		String st1 = "abcdefg";
		
		//인덱스 2이후부터 출력
		String st2 = st1.substring(2);
		System.out.println(st2);
		
		//인덱스  2이후부터 4미만 출력
		String st3 = st1.substring(2,4);
		System.out.println(st3);

	}
}
