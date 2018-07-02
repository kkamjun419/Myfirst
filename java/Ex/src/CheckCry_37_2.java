interface Animal2
{
	void cry();
}

class Cat3 implements Animal2
{
	public void cry()
	{
		System.out.println("야옹~");
	}
	
}

class Dog3 implements Animal2
{
	public void cry()
	{
		System.out.println("멍멍!");
	}
	
}


public class CheckCry_37_2 {

	public static void main(String[] args) 
	{
		Animal2 cat = new Cat3();
		Animal2 dog = new Dog3();
		
		//checkAnimal(cat);
		checkAnimal(dog);
	}
	
	public static void checkAnimal(Animal2 animal)
	{
		if (animal instanceof Cat3)
		{
			System.out.println("고양이");
			animal.cry();
		}
		else if (animal instanceof Dog3)
		{
			System.out.println("강아지");
			animal.cry();
		}	
	}		
}

