class Apple1
{
	public String toString() 
	{
		return "I am an apple";
	}
}

class Orange1
{
	public String toString()
	{
		return "I am an orange.";
	}
}

class AppleBox1
{
	private Apple1 ap;
	
	public void set(Apple1 a)
	{
		ap = a;
	}
	public Apple1 get() 
	{
		return ap;
	}
}

class OrangeBox1 
{
	private Orange1 or;
	
	public void set(Orange1 o)
	{
		or = o;
	}
	public Orange1 get() 
	{
		return or;
	}
}



public class A1_FruitAndBox {

	public static void main(String[] args) {
		AppleBox1 aBox = new AppleBox1();
		OrangeBox1 oBox = new OrangeBox1();
		
		aBox.set(new Apple1());
		oBox.set(new Orange1());
		
		Apple1 ap = aBox.get();
		Orange1 or = oBox.get();
		
		System.out.println(ap);
		System.out.println(or);
	}

}
