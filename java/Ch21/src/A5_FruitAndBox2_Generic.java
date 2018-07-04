
class Apple5
{
	public String toString() 
	{
		return "I am an apple";
	}
}

class Orange5
{
	public String toString()
	{
		return "I am an orange.";
	}
}

class Box5<T>
{
	private T ob;
	
	public void set(T o)
	{
		ob = o;
	}
	public T get()
	{
		return ob;
	}
}
class A5_FruitAndBox2_Generic {

	public static void main(String[] args) {
		Box5<Apple5> aBox = new Box5<Apple5>();
		Box5<Orange5> oBox= new Box5<Orange5>();
		
		//과일을 박스에 담은 것일까?
		aBox.set(new Apple5());
		oBox.set(new Orange5());
		
		//aBox.set("Apple");			//실행되지 않는다
		//oBox.set("Orange");
		
		//박스에서 과일을 꺼내는데 형 변환 하지 않는다.
		Apple5 ap = aBox.get();
		Orange5 og = oBox.get();
		
		System.out.println(ap);
		System.out.println(og);

	}

}
