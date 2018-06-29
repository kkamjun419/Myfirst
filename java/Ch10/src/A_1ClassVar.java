class InstCnt 
{
	static int instNum = 0;
	//int instNum = 0;
	InstCnt() {
		instNum++;
		System.out.println("인스턴스 생성: " + instNum);
	}
}
	
public class A_1ClassVar {

	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
	}
}
//static으로 선언된 변수는 
//개별인스턴스의 변수가 아니라 
//모든 인스탄스가 공유하는 클래스 변수가 된다.
