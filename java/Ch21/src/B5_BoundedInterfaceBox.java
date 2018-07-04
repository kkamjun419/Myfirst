//제네릭 클래스의 타입 인자를 인터페이스로 제한하기

interface Eatable
{
	public String eat();
}

class AppleB implements Eatable
{
	public String toString()
	{
		return "I am apple.";
	}
	
	@Override
	public String eat() 
	{
		return "It tastes so good!";
	}
}

class BoxB<T extends Eatable>
{
	private T ob;
	
	public void set(T o)
	{
		ob = o;
	}
	
	//한입 먹고 반환하는 행위의 메소드로 수정
	public T get()
	{
		System.out.println(ob.eat());
		return ob;
	}
}

public class B5_BoundedInterfaceBox {

	public static void main(String[] args) {
		BoxB<AppleB> box =  new BoxB<>();
		box.set(new AppleB());
		
		AppleB ap = box.get();
		System.out.println(ap);
	}

}
