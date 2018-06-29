class Circle2{

	private double rad = 0; // 원의 반지름
	final double PI = 3.14;

	public Circle2(double r) 
	{
		setRad(r);
	}

	public void setRad(double r) 
	{
		if (r < 0) 
		{
			rad = 0;
			return;
		}
		rad = r;
	}
	public double getRad() {
		return rad;
	}

	public double getArea() {
		return (rad * rad) * PI;
	}
}
class B_InfohideCircle {


	public static void main(String[] args) {
		Circle2 c = new Circle2(1.5);
		System.out.println(c.getArea());

		c.setRad(2.5);
		System.out.println(c.getArea());

		c.setRad(-3.3);
		System.out.println(c.getArea());

		//c.rad = -4.5; // 직접 수정가능(위험)
		System.out.println(c.getArea());

	}

}
