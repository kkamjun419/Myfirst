class Accessway{
	static int num = 0;
	
	Accessway() { incrCnt();}
	void incrCnt() {
		num++; //클래스 내부에서 이름을 통한 접근
		System.out.println(num);
	}
}

 class ClassVarAccess {

	public static void main(String[] args) {
		
		//외부에서 인스턴스의 이름을 통한 접근
		Accessway way = new Accessway();
		way.num++; 
		System.out.println("num = " + way.num);
		
		// 외부에서 클래스 이름을 통한 접근
		Accessway.num++; 
		System.out.println("num = " + Accessway.num);

	}

}
